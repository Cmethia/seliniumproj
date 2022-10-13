package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(linkText="Books")WebElement Bk;//locate the element
	@FindBy(xpath="//a[@aria-label='Amazon']")WebElement AmazonLO;//locate the element
	@FindBy(id="twotabsearchtextbox")WebElement SearchField;//locate the element//nav-search-submit-button
	@FindBy(id="nav-search-submit-button")WebElement SearchLoop;


	
	public void  AllBooksClick() { //create the method
 Bk.click();
 }
 public void logoToClick() {
	 AmazonLO.click();
	 
	 
	}
 public void searchKeys(){
	 SearchField.sendKeys("Computer");
 }
 public void SearchClick() {
	 SearchLoop.click();
 }
 
 

public Home(WebDriver driver) { //create the constructor
	 this.driver=driver;
	 PageFactory.initElements(driver, this); //it help us initialize all the elements
	 
	
	
}
}