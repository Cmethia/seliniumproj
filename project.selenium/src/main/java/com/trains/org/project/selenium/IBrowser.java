package com.trains.org.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowser {
static WebDriver driver;// Webdriver is an interface , driver is a reference to webdriver interface 

	public static void main(String[] args) throws InterruptedException {  
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
        driver.get("https://www.peoplentech.com/");
        driver.navigate().to("https://www.w3schools.com");
        // Maximize the browser with the help of selinium
        driver.manage().window().maximize();
     // this is a compile time exception to give pause to your script
        Thread.sleep(1000); 
        //to refresh the browser
        driver.navigate().refresh();
        Thread.sleep(1000); 
        //to go backward , for example one step back
        driver.navigate().back();
        Thread.sleep(1000); 
        driver.navigate().forward();
        Thread.sleep(1000); 
        // every browser has a unique ID in selenium we call it window handle 
        //and we use it when we want to switch from one window to another
        //A window handle stores the unique address of the browser windows.
        //if I want to see a window handle in a console, we can use sysout to print anything in the console
        //save this value into some variable then printout this variable
        //window handle is in string format
        //everytime you open the browser the window id should be different 
        String windowhandle= driver.getWindowHandle(); 
        System.out.println(windowhandle);
        //to get the current URL
        //it will get the current url and save the url then print it out
        String urlfbrowser= driver.getCurrentUrl();
        System.out.println(urlfbrowser);
        //close the browser 
        driver.close(); // it will only close one browser or window
        
        
        
        
       
        
	}

}
