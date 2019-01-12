package automationScript;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Constant;
import Utility.Log;
import pageObjectModel.Login;
import pageObjectModel.MyStore;

public class RunnerScript
{
	public static WebDriver driver = null;
	
	@BeforeTest
	public void setDriver()
	{
		DOMConfigurator.configure("log4j.xml");
		
		System.setProperty("webdriver.chrome.driver", Constant.driverPath);
		
		Log.info("Driver instantiated");
		
		driver = new ChromeDriver();
		
		Log.info("Chrome driver instantiated");
	}
	
	@Test
	public void accountCreate()
	{	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(Constant.url);
		
		Log.info("URL launched");
		
		driver.manage().window().maximize();
		
		Log.info("Window maximized");
		
		MyStore.lnk_Login(driver).click();
		
		Log.info("Clicked on Sign In");
		
		Login.txtBox_EmailAddress(driver).sendKeys("diprocks@gmail.com");
		
		Log.info("Entered email address");
		
		Login.btn_CreateAccount(driver).click();
		
		Log.info("Clicked on created account");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		
		Log.info("Browser closed");
	}
}