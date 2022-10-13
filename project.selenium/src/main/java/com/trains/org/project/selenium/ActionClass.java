package com.trains.org.project.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
        driver.get("https://www.amazon.com");
    
        // Maximize the browser with the help of selinium
        driver.manage().window().maximize();
        WebElement signIn =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions act=new Actions(driver);
        act.moveToElement(signIn).build().perform();
        Thread.sleep(3000);
        WebElement PrimeMembership = driver.findElement(By.xpath("//*[text()= 'Prime Membership']"));
        Actions pri=new Actions(driver);
       pri.moveToElement(PrimeMembership).click().build().perform();
	}

}
