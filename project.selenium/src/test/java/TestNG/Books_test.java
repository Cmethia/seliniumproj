package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import amazon.Books;
import amazon.ChipWar;
import amazon.Home;
import common.Utility;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class Books_test extends Utility {
	 
//data providers is used to check different option with different data sets	

  @Test(priority=0)
  public void f() {
	  Home hm=new Home(driver);
	  hm.AllBooksClick();
	  String ur=driver.getCurrentUrl();
	  System.out.println(ur);
	  SoftAssert SA=new SoftAssert();
	  SA.assertEquals(ur, "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books");
	 //Assert.assertEquals(ur,"https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books1");
	
	 int linked = driver.findElements(By.tagName("a")).size();  //every link have a tag name//size is total number of links 
	 System.out.println("total number of links=" +linked);
	 int homelinked=driver.findElements(By.linkText("Amazon Home")).size();
	 System.out.println("Amazon home count="+homelinked);
	 if(homelinked==1) {
		 driver.findElement(By.linkText("Amazon Home")).click();
	 }else {
		 System.out.println("Element is not displaying");
	 }	 

	  Books bk=new Books(driver);
	  bk.DealBooks();
	  ChipWar ch=new ChipWar(driver);
	  ch.DealCHIP();
	  //we went through xml file and used paramitization then did verification using hard and soft asserts
	  SA.assertAll(); 
  }
  @Test(priority=1, dependsOnMethods="f")
  public void SearchFieldVerification() {
	  Home home=new Home(driver);
	  home.logoToClick();
	  home.searchKeys();
	  home.SearchClick();
	  driver.close();
  }
 
    
  
  
}