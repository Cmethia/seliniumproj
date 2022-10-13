package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
		// TODO Auto-generated method stub
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
			
			driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
	        driver.get("https://www.amazon.com");
	    
	        // Maximize the browser with the help of selenium
	        driver.manage().window().maximize();	
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
	        Actions ob=new Actions(driver);
	        ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	        ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
	        ob.keyUp(Keys.CONTROL);
	        Thread.sleep(2000);
	        ob.sendKeys(Keys.DELETE).build().perform();
	        Thread.sleep(2000);
	        ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	        
	        
	}

}
