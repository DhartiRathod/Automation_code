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
		//ffdriver.findElementByLinkText("Personalize").click();
		if(ffdriver.findElementByXPath("//a[@href='https://www.shutterfly.com/creationpath/bundle/views/type/3/group/3?bundleId=3&amp;productCode=1277535&amp;categoryCode=60412&amp;brand=WPD&amp;skuCode=1277536&amp;sizeIds=23&amp;occasionIds=13&amp;styleIds=779&amp;addOns=FOIL_COLOR%3Agold_foil%2CCARD_SIZE_ID%3A23%2CPAPER_TYPE%3ARegular%2CPAPER_FINISH%3AMatte%2CTRIM%3ARegular&amp;qty=75&amp;useProcSimple=true']").isDisplayed()){
		   ffdriver.findElementByXPath("//a[@href='https://www.shutterfly.com/creationpath/bundle/views/type/3/group/3?bundleId=3&amp;productCode=1277535&amp;categoryCode=60412&amp;brand=WPD&amp;skuCode=1277536&amp;sizeIds=23&amp;occasionIds=13&amp;styleIds=779&amp;addOns=FOIL_COLOR%3Agold_foil%2CCARD_SIZE_ID%3A23%2CPAPER_TYPE%3ARegular%2CPAPER_FINISH%3AMatte%2CTRIM%3ARegular&amp;qty=75&amp;useProcSimple=true']").click();
		} else {
			ffdriver.findElementByXPath("//a[href='https://www.shutterfly.com/creationpath/bundle/views/type/3/group/3?bundleId=3&productCode=1277535&categoryCode=60412&brand=WPD&skuCode=1277536&sizeIds=23&occasionIds=13&styleIds=779&addOns=FOIL_COLOR%3Agold_foil%2CCARD_SIZE_ID%3A23%2CPAPER_TYPE%3ARegular%2CPAPER_FINISH%3AMatte%2CTRIM%3ARegular&qty=75&useProcSimple=true']").click();
		}
	}
}
