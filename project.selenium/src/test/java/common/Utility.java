package common;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
public WebDriver driver;
@Parameters({"Browser","URL"})// Utility class is a class that contains all the common codes
//the purpose of parameter we can add value and fetch the data from the xml file

  @BeforeClass
  
	  public void Browser (String NameOfBrowser, String URL  ) {
			if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
				String jk=System.getProperty("user.dir");
				System.out.println(jk);
			System.setProperty("webdriver.chrome.driver",jk+"\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(URL);
		  driver.manage().window().maximize();		 
	      }else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
	    	  String jk=System.getProperty("user.dir");
				System.out.println(jk);
	      	System.setProperty("webdriver.edge.driver",jk+"\\Drivers\\msedgedriver.exe" );
	      	driver=new EdgeDriver();
	      	driver.get(URL);	    	
	      	driver.manage().window().maximize();
	      	}
  }

  @AfterClass
  public void afterClass() throws IOException {
	  Screenshots();
  }
  public void Screenshots() throws IOException {
	  Date multiScreen=new Date();
		String ShotEdited= multiScreen.toString().replace(" ", "-").replace(":", "_");
	  File HomePage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(HomePage, new File("C:\\Users\\Celia\\git\\repository\\project.selenium\\picture\\"+ShotEdited+"Desktop.jpg"));
  }
  }


