package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session9Browser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
        driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
        driver.get("https://www.facebook.com/");
        /*Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        String windows=driver.getWindowHandle();
        System.out.println(windows);
        String K=driver.getCurrentUrl();
        System.out.println(K);
        String titlesk=driver.getTitle();
        System.out.println(titlesk);
        //driver.close();
        //driver.quit();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("hhhh2@gmail.com");
        WebElement password =driver.findElement(By.name("pass"));
        // we use send key whenver we want to fill the fields //to search in html //*[@class=''
        password.sendKeys("hhhhfdff");
       WebElement loginField = driver.findElement(By.name("login"));
        //loginField.click();
       // WebElement forgotpass = driver.findElement(By.linkText("Forgot password?"));
       // forgotpass.click();
        WebElement forgotpass = driver.findElement(By.partialLinkText("Forgot password"));
        //forgotpass.click();*/
        
        WebElement createAccount=driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        		//select class help us to select the value from the drop down
        Thread.sleep(2000);
        WebElement Month= driver.findElement(By.name("birthday_month"));
        Select ob=new Select(Month);
        ob.selectByIndex(5);
        WebElement dy = driver.findElement(By.id("day"));
        Select oj=new Select(dy);
        oj.selectByValue("7");
        
        WebElement yr=driver.findElement(By.id("year"));
        Select bj=new Select(yr);
        bj.selectByValue("2000");
        Thread.sleep(2000);
    //Assignments       
        WebElement firstNField =driver.findElement(By.name("firstname"));
        firstNField.sendKeys("sara");
        firstNField.click();
        Thread.sleep(2000);
        WebElement lastNField =driver.findElement(By.name("lastname"));
        lastNField.sendKeys("Mth");
        lastNField.click();	
        Thread.sleep(2000);
        WebElement emailField =driver.findElement(By.name("reg_email__"));
        emailField.sendKeys("ayla1234@gmail.com");
        emailField.click();
        WebElement ReEmail=driver.findElement(By.name("reg_email_confirmation__"));
        ReEmail.sendKeys("ayla1234@gmail.com");
        ReEmail.click();
        Thread.sleep(2000);
        WebElement passwordField =driver.findElement(By.id("password_step_input"));
        passwordField.sendKeys("abcd1234@!");
        passwordField.click();
        WebElement GenderField =driver.findElement(By.className("_58mt"));
        GenderField.click();        
        //Absolute Xpath
        //WebElement firstname =driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div/input"));
       // firstname.sendKeys("hjkkh");
       
        WebElement toggles =driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
        toggles.click();
        //WebElement SignUP =driver.findElement(By.name("websubmit"));
        //SignUP.click();
        //Relative Xpath
        //to make it unique we can use grouping and indexing in the Xpath 
        //first, we need to enclose the xpath in parenthesis second we add brackets and inside them we need to pick 
        //an index number that ranges between 1 and 3
       //WebElement Signbt=driver.findElement(By.xpath("(//button[@type='submit' ])[2]"));
        WebElement Signbt=driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
        Signbt.click();
        WebElement forgotPass=driver.findElement(By.xpath("//*[contains(text(), 'Forgot')]"));
        
        
	}

}
