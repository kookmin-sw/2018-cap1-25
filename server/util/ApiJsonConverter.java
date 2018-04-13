package cp.orbit.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;


public class ApiJsonConverter {
	
	/* Log */
	private static final Logger logger = LoggerFactory.getLogger(ApiJsonConverter.class);
	
	/* API 개발시 암호화 여부  
	 * false : 암호화 안함
	 * true  : 암화화 적용 
	 */
	public boolean API_SECRET_MODE = true;
	
	
	/**
	 * 객체 생성시 암호화 적용여부를 파라미터로 받아서 처리한다.
	 *  - mode -
	 * false : 암호화 안함
	 * true  : 암화화 적용 
	 * @param mode
	 */
	public ApiJsonConverter(boolean mode) {
		this.API_SECRET_MODE = mode;
	}
	
	
	/**
	 * api 개발시 암호화 적용 여부에 따라 JsonElement를 파싱한다. 
	 * @param String bodyParam
	 * @return
	 */
	public JsonElement paramJsonConvert(String bodyParam) {
		JsonElement mJsonElement = paramJsonConvert(bodyParam, this.API_SECRET_MODE);
		
		return mJsonElement;
	}
	
	
	/**
	 * 2중 암호화시 사용 
	 * api 개발시 암호화 적용 여부에 따라 JsonElement를 파싱한다. 
	 * @param String bodyParam
	 * @param boolean mode
	 * @return
	 */
	public JsonElement paramJsonConvert(String bodyParam, boolean _mode) {
		JsonElement mJsonElement = null;
		
		try {
			if(this.API_SECRET_MODE) {
				BodyParamConvert mBodyParamConvert = new BodyParamConvert();
				mJsonElement = mBodyParamConvert.bodyParamConvert(bodyParam);
			} else {
				JsonParser parser = new JsonParser();
				mJsonElement = parser.parse(bodyParam);
			}
		} catch (Exception e) {
			logger.error("### Error : {}", e.getMessage());
		}
		
		
		return mJsonElement;
	}
	
	
	/**
	 * 1차 암호화시 사용 
	 * api 개발시 암호화 적용 여부에 따라 JsonElement를 파싱한다. 
	 * @param String bodyParam
	 * @param boolean mode
	 * @return
	 */
	public JsonElement paramJsonConvertOne(String bodyParam, boolean _mode) {
		JsonElement mJsonElement = null;
		
		try {
			if(this.API_SECRET_MODE) {
				BodyParamConvert mBodyParamConvert = new BodyParamConvert();
				mJsonElement = mBodyParamConvert.loginConvert(bodyParam);
			} else {
				JsonParser parser = new JsonParser();
				mJsonElement = parser.parse(bodyParam);
			}
		} catch (Exception e) {
			logger.error("### Error : {}", e.getMessage());
		}
		
		logger.error("### infor mJsonElement : {}", mJsonElement);
		
		return mJsonElement;
	}

}
