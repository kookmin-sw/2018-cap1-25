import bcrypt from "bcryptjs";
import jws from "jws";
import crypto from "crypto";

/** 
 * 암호화에 사용한
 * salt key, ase key값은 git에 안올렸습니다. 
 * 
 * 
 * 
 * 
 * */



/**ADD jihoon responseData decode no tokenKey*/
export function f_decodeDataSingle(jsonData) {
  var decipher = crypto.createDecipheriv(AES_CRYPT, aeskey, iv);
  var decipheredPlaintext = decipher.update(jsonData, "base64", "utf8");

  decipheredPlaintext += decipher.final("utf8");
  const jsonDataDecode = JSON.parse(decipheredPlaintext);
  return jsonDataDecode;
}

export function f_decodeData(responseData) {
  var jwsKey = window.sessionStorage.getItem("tokenKey");
  var oriData = jws.decode(responseData);
  var jsonData = oriData.payload;

  var decipher = crypto.createDecipheriv(AES_CRYPT, aeskey, iv);
  var decipheredPlaintext = decipher.update(jsonData, "base64", "utf8");

  decipheredPlaintext += decipher.final("utf8");
  const jsonDataDecode = JSON.parse(decipheredPlaintext);
  return jsonDataDecode;
}

/**ADD jihoon userPw encode*/
export function f_encodeUserPw(oriUserPw) {
  var encodePw = bcrypt.hashSync(oriUserPw, salt);

  return encodePw;
}

/**ADD jihoon jsonData encode*/
export function f_encodeJsonDataWithToken(jsonData) {
  var cipher = crypto.createCipheriv(AES_CRYPT, aeskey, iv);

  var cipheredPlaintext = cipher.update(JSON.stringify(jsonData), "utf8", "base64");
  cipheredPlaintext += cipher.final("base64");

  var jwsKey = window.sessionStorage.getItem("tokenKey");
  const jsonDataEncode = jws.sign({
    header: { alg: "HS256" },
    payload: cipheredPlaintext,
    secret: jwsKey
  });
  return jsonDataEncode;
}

export function f_encodeJsonData(jsonData) {
  var cipher = crypto.createCipheriv(AES_CRYPT, aeskey, iv);

  var cipheredPlaintext = cipher.update(JSON.stringify(jsonData), "utf8", "base64");
  cipheredPlaintext += cipher.final("base64");

  return cipheredPlaintext;
}
