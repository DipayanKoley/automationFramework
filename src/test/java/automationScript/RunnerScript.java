package automationScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.Constant;
import pageObjectModel.Login;
import pageObjectModel.MyStore;

public class RunnerScript
{
	public static WebDriver driver = null;
	
	@Test
	public void accountCreate()
	{	
		System.setProperty("webdriver.chrome.driver", Constant.driverPath);
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(Constant.url);
		
		driver.manage().window().maximize();
		
		MyStore.lnk_Login(driver).click();
		
		Login.txtBox_EmailAddress(driver).sendKeys("diprocks@gmail.com");
		
		Login.btn_CreateAccount(driver).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.quit();
	}
}