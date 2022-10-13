package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
		        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
		        driver.get("https://demoqa.com/alerts");
		    
		        // Maximize the browser with the help of selinium
		        driver.manage().window().maximize();		    
		        driver.findElement(By.id("alertButton")).click();			       
		        driver.switchTo().alert().accept();	
		        driver.navigate().refresh();
		        driver.findElement(By.id("confirmButton")).click();
		        driver.switchTo().alert().dismiss();
		        driver.findElement(By.id("promtButton")).click();	
		        driver.switchTo().alert().sendKeys("tech");
		        driver.switchTo().alert().dismiss();//g
		        
		       	        
	}

}
