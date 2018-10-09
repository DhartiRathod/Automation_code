package selenium_first_automation;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Personalise_card{
	FirefoxDriver ffdriver;
	
	public void personalize_card(){
		System.setProperty("webdriver.gecko.driver","/Applications/geckodriver");
		ffdriver = new FirefoxDriver();
		ffdriver.get("https://www.shutterfly.com/cards-stationery/save-the-date/fanciful-sprinkle-romance-save-the-date?skuCode=1277536");
		ffdriver.findElementByLinkText("Personalize").click();
	}
}
