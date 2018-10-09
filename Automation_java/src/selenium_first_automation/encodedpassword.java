package selenium_first_automation;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

public class encodedpassword {
	
	String password = "Krunal1307";
	//method to get encoded password
@Test
	public void encodepassword(){
	byte[] encodedpassword = Base64.encodeBase64(password.getBytes());
	System.out.println("encoded string is :" + new String(encodedpassword));
}

//encodedPassword = "S3J1bmFsMTMwNw==";
public String decodedPassword (String encodedpassword){
	byte[] decodepassword = Base64.decodeBase64(password);
	System.out.println("decoded string is :" + new String(decodepassword));
	return new String (decodepassword);
	}
}
