package automationScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import pageObjectModel.MyStore;

public class ContactRunnerScript
{	
	@Test
	public void contact()
	{
		DriverSet.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		DriverSet.driver.get(Constant.url);
		
		Log.info("URL launched");
		
		DriverSet.driver.manage().window().maximize();
		
		Log.info("Window maximized");
		
		MyStore.lnk_Contact(DriverSet.driver).click();
		
		DriverSet.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
}
