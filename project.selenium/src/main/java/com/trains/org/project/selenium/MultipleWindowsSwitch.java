package com.trains.org.project.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsSwitch {
static WebDriver driver;// Webdriver is an interface , driver is a reference to webdriver interface 

		public static void main(String[] args) throws InterruptedException {  
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
	        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
	        driver.get("https://www.amazon.com/");
	        // Maximize the browser with the help of selinium
	        driver.manage().window().maximize();
	        driver.navigate().refresh();
	       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Amazon Basics")));
	       
	        WebElement Bas=driver.findElement(By.linkText("Amazon Basics"));
	        Actions ob=new Actions(driver);
	        ob.keyDown(Keys.SHIFT).perform();
	        Bas.click();
	        ob.keyUp(Keys.SHIFT).build().perform();
	        Set<String> windowH=driver.getWindowHandles();
	        Iterator<String> iterator=windowH.iterator();
	        String FirstWindowH=iterator.next();
	        String SecondWindowH=iterator.next();
	        System.out.println(FirstWindowH);
	        System.out.println(SecondWindowH);
	        driver.switchTo().window(SecondWindowH);
	        WebElement BedR=driver.findElement(By.xpath("//li[@class='style__navItem__3rEc7 style__hasChildren__okeZi'][1]"));
	        BedR.click();
	        
            Thread.sleep(4000);
            driver.quit();
	        		
	}

}
