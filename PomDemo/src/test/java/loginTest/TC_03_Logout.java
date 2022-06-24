package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

public class TC_03_Logout {
	
  WebDriver driver = DriverSetup.setupDriver();
	  
  //Login PageObject
  LoginPage login = new LoginPage (driver);
  DashboardPage dashboard = new DashboardPage(driver);
		  
  @BeforeTest
  public void startWebDriver() {
      driver.get(GlobalVariables.HOME_PAGE);
	  driver.manage().window().maximize();
	      
 }
	
  @Test
  public void TC_03() throws InterruptedException {
	//Step 1: Login
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	//Step 2 : Logout
	  dashboard.logout();
	 
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
