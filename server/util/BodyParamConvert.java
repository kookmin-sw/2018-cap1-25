/**ADD jihoon */
package cp.orbit.common.util;


import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


import org.apache.tomcat.util.codec.binary.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;



import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;


import cp.orbit.common.CreationPotInfo;

/**
 * 암호화된 json data 복호화후 jsonObject로 변환 *  
 * @version  1.00 
 * @author 이지훈  
 */
@Service("cp.orbit.common.util.BodyParamConvert")
public class BodyParamConvert {

	@Resource(name = "cp.orbit.common.util.TokenHandle")	
	TokenHandle tokenHandle;

	private static final Logger logger = LoggerFactory.getLogger(BodyParamConvert.class);

	/**
	 * ADD jihoon
	 * 토큰키 x, 비로그인시 사용합니다.
	 * aes 복호화  합니다.
	 * 
	 * @param bodyparam
	 * @return JsonElement
	 * @throws Exception
	 */
	public JsonElement loginConvert(String bodyparam) throws Exception {

		String jsonData = "";

		try {
			
			jsonData = genAESCrypt(bodyparam);

		} catch (Exception e) {
			e.printStackTrace();
		}

		JsonParser parser = new JsonParser();
		JsonElement mJsomelement = parser.parse(jsonData);

		return mJsomelement;

	}

	/**
	 * ADD jihoon
	 * 로그인후 데이타 호출시 사용합니다.
	 * 토큰 유효성 검사후 aes복호화
	 * 유효한 토큰이 아닐시 return null
	 * 토큰키 필요합니다.
	 * 
	 * @param bodyparam
	 * @return JsonElement
	 * @throws Exception
	 */
	public JsonElement bodyParamConvert(String bodyparam) throws Exception{
 
		String jsonData="";
		final JWSObject jwsObject = JWSObject.parse(bodyparam);

		try {
			
			String dencodeData = jwsObject.getPayload().toString();
			jsonData = genAESCrypt(dencodeData);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JsonParser parser = new JsonParser();
		JsonElement mJsomelement = parser.parse(jsonData);
		String tokenKey = mJsomelement.getAsJsonObject().get("tokenKey").getAsString();
		JWSVerifier verifier = new MACVerifier(tokenKey);
		
		if(jwsObject.verify(verifier)) {
			return mJsomelement;
		} else {
			JsonElement nullJsonElement = parser.parse("");
			return nullJsonElement;
		}

	}
	
	
	
	/**
	 * AES방식으로 암호화해서 리턴 
	 * @param String dencodeData
	 * @return
	 */
	public String genAESCrypt(String dencodeData) {
		String jsonData="";
		
		try {
			/**
			 * ADD jihoon
			 * java단에서 aes인코딩 데이타 "/" 를 "%2F"로 읽어와서 string replace로
			 * 변환 시켜줬습니다. 혹시 다른 특수문자도 java에서 자동 변환해서 읽으면 추가해주면 됩니다.
			 * 아직까지는 "/" 말고는 없었습니다. 
			 */
			String findList = "%2F";
			String changeList = "/";
			dencodeData = StringUtils.replace(dencodeData, findList, changeList);
			
			SecretKeySpec aesKey = new SecretKeySpec(CreationPotInfo.ORBIT_AES_KEY,"AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, aesKey, new IvParameterSpec(CreationPotInfo.ORBIT_AES_IV));
			byte[] result = Base64.decodeBase64(dencodeData);
			byte[] resultData = cipher.doFinal(result);
			jsonData = new String(resultData,0,resultData.length);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonData;
	}

}
