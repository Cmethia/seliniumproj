package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wording {
private static final String WebEelement = null;
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
		        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
		        driver.get("https://www.facebook.com");
		    
		        // Maximize the browser with the help of selinium
		        driver.manage().window().maximize();
		        String titles=driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText() ;
		        System.out.println(titles);
	}

}
