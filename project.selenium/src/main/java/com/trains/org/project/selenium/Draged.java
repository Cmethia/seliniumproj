package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draged {

		// TODO Auto-generated method stub
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
	        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
	        driver.get("https://jqueryui.com/droppable/");
	        driver.manage().window().maximize();
	        driver.switchTo().frame(0);	   
	        WebElement dragged =driver.findElement(By.id("draggable"));
	        WebElement dropdes =driver.findElement(By.id("droppable"));
	        Actions act=new Actions(driver);
	        act.dragAndDrop(dragged, dropdes).build().perform();
	        driver.switchTo().parentFrame();
	        WebElement sized =driver.findElement(By.linkText("Resizable"));	       
	        sized.click();

	      
	}

}
