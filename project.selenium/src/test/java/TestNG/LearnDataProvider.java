package TestNG;

import org.testng.annotations.Test;

import Facebook.HomeF;
import common.Utility;

import org.testng.annotations.DataProvider;

public class LearnDataProvider extends Utility {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	  HomeF hm=new HomeF(driver);
	 hm.FieldEmail(n);
	 Thread.sleep(6000);
	 hm.PasswordTo(s);
	 Thread.sleep(6000);
	 hm.LoginToClick();
	 driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "tested", "password" },//the code will run three times
      new Object[] { "tested66", "b8" },
      new Object[] { "", "b8" },
    };
  }
}
