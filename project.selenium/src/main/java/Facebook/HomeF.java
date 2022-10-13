package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeF {
	WebDriver driver;
	@FindBy(name="email")WebElement fieldEmail;
	@FindBy(name="pass")WebElement fieldpassword;
	@FindBy(name="login")WebElement LoginButton;
	 

	public HomeF(WebDriver driver) { //create the constructor
		 this.driver=driver;
		 PageFactory.initElements(driver, this); //it help us initialize all the elements
	} 
		 public void FieldEmail(String name) {
			 fieldEmail.clear();
			 fieldEmail.sendKeys(name);
		 }
		 public void PasswordTo(String pass) {
			 fieldpassword.sendKeys(pass);
		 }
		 public void LoginToClick() {
			 LoginButton.click();
			 
			
		 }
		
	
	}


