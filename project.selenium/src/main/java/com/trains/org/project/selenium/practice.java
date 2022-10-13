package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

		static WebDriver driver;// Webdriver is an interface , driver is a reference to webdriver interface 

		public static void main(String[] args) throws InterruptedException {  
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
	        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
	        driver.get("https://www.amazon.com/");
	        // Maximize the browser with the help of selinium
	        driver.manage().window().maximize();
	        WebElement createAccount=driver.findElement(By.linkText("Create new account"));
	        createAccount.click();        	        
	       //WebElement Toggles=driver.findElement(By.xpath(("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]")));
	//Toggles.click();	        
	WebElement SignAcc=driver.findElement(By.xpath("//button[text()='Sign Up'][2]"));
	SignAcc.click();
	WebElement ForgotPss=driver.findElement(By.xpath("//*[contains(text(), 'Forgot password?')]"));
	ForgotPss.click();
	
	WebElement SignIN=driver.findElement(By.id("nav-flyout-ya-signin"));
	Actions acc=new Actions(driver);
	acc.moveToElement(SignIN).build().perform();
	WebElement membershipp=driver.findElement(By.xpath(null)
	acc.moveToElement(membershipp).click().build().perform();
	
	
			
	
		}

}
