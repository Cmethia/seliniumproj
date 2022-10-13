package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
        driver.get("https://www.expedia.com/Flights");
    
        // Maximize the browser with the help of selinium
        driver.manage().window().maximize();	
        driver.findElement(By.id("d1-btn")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@aria-label='Oct 6, 2022']")).click();
        Thread.sleep(6000);  
        driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();
   
        
   
        
	}

}
