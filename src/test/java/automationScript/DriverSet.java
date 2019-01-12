package automationScript;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class DriverSet
{
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void setDriver() throws IOException
	{
		DOMConfigurator.configure("log4j.xml");
		
		System.setProperty("webdriver.chrome.driver", Constant.driverPath);
		
		Log.info("Driver instantiated");
		
		driver = new ChromeDriver();
		
		Log.info("Chrome driver instantiated");
		
		//ExcelUtils.setExcel(Constant.excelPath, Constant.sheetName);
		
		//Log.info("Excel file set");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		
		Log.info("Browser closed");
	}
}
