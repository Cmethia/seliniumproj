package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnn {
	  static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
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
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }
  

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("This is after methodannotation");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\celia\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe"); ///right click in chromdriver to get the path
      driver=new ChromeDriver(); /// ChromeDriver(); this is chrome driver class constructor 
       driver.navigate().to("https://www.amazon.com");
      // Maximize the browser with the help of selinium
      driver.manage().window().maximize();
	  System.out.println("This is before class annotation");
  }

  @AfterClass//7
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }
  @Test
  public void Test6() {
	  System.out.println("This is other test annotation");
  }
  

 @BeforeTest//2
 
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest//9
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
