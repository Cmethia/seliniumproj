package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChipWar {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='a-row a-spacing-small'][1]") WebElement CH;
	
	public void DealCHIP () { //create the method
		 CH.click();
	}
	public ChipWar (WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this); 
	}	
}

