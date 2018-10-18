package selenium_first_automation;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignIn {

	/*public static void chromeDriver (){
	System.setProperty("webdriver.chrome.driver","/Applications/ChromeDriver");
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.get("http://google.com");
	}
	*/
	
	
	
	@Test
	//close the modal sign-up-popup
	public void FFDriver () throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","/Applications/geckodriver");
		FirefoxDriver ffdriver;
		ffdriver = new FirefoxDriver();
		ffdriver.get("https://www.shutterfly.com/");
		if(ffdriver.findElementByXPath("//div[@class='modal-wrapper']/button[@class='modal-close']").isDisplayed()){
			ffdriver.findElementByXPath("//div[@class='modal-wrapper']/button[@class='modal-close']").click();
		}else{
			ffdriver.findElementByXPath("//div[@class='modal-header']/button[@class='close-button']").click();
		     }
		
		//signin
		ffdriver.findElementByLinkText("Sign in").click();
		ffdriver.findElementByXPath("//div[@class='signin_input']/input[@class='signin_text_field']").sendKeys("dharti.krunal@gmail.com");
		//encoded password = "S3J1bmFsMTMwNw=="; //question: how to call class in testng
		//decodedPassword pwd = new decodedPassword("S3J1bmFsMTMwNw==");
		ffdriver.findElementById("password").sendKeys("Krunal1307");
		ffdriver.findElementById("signInButton").click();
	
	
		
		//search
		ffdriver.findElementById("srchTxtField").sendKeys("foil card");
		ffdriver.findElementByClassName("srch_go").click();
		
		//select card
		ffdriver.findElementByLinkText("Fanciful Sprinkle Romance Save The Date").click();
		ffdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//Personalize : card
		ffdriver.findElementByXPath("//div[@class='social-personalize-section']/a[@class='button primary-button']").click();
		ffdriver.findElementById("stringField-bride_name").sendKeys("Dharti Rathod");
		ffdriver.findElementById("stringField-groom_name").sendKeys("Krunal Shah");
		ffdriver.findElementById("dateField-event_date").sendKeys("01222019");
		ffdriver.findElementById("stringField-city").sendKeys("Vadodara");
		ffdriver.findElementById("stringField-state_province").sendKeys("Gujarat");
		ffdriver.findElementsByXPath("//a[contains(text(),'Done')]");
		//System.out.println("found xpath");
		
		}
	 
	/*@Test
	public void SignIn_valid(){
		
	}
	
	@AfterMethod
	public void Quit_driver () throws InterruptedException{
		
	}
	*/
	
	
}
