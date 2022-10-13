package com.trains.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class EdgeBrowserSetup {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		 IBrowsers("Edge");			
		 String titles=driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText() ;
	        System.out.println(titles);	
	        Screenshots() ;
	        Screenshots();
	}	       
        public static void IBrowsers(String NameOfBrowser) {
		if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
        }else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
        	System.setProperty("webdriver.edge.driver","C:\\Users\\Celia\\git\\repository\\project.selenium\\Drivers\\msedgedriver.exe" );
        	driver=new EdgeDriver();
        	driver.get("https://www.facebook.com");
        	driver.manage().window().maximize();
        	//driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText();
        	//driver.findElement(By.
        	
        	
        }
		
        }
		
       
      public static void Screenshots() throws IOException {
    	  Date multiScreen=new Date();
			String ShotEdited= multiScreen.toString().replace(" ", "-").replace(":", "_");
    	  File HomePage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  FileHandler.copy(HomePage, new File("C:\\Users\\Celia\\git\\repository\\project.selenium\\picture\\"+ShotEdited+"Desktop.jpg"));
    	  
      }
        
        
        

}
