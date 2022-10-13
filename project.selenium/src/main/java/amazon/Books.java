package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {
	WebDriver driver;

	@FindBy(linkText="Deals in Books") WebElement DB;
	
	public void  DealBooks() { //create the method
		 DB.click();
	}
	public Books(WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this); 
	}	
}