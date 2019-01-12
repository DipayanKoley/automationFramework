package automationScript;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import Utility.Constant;
import Utility.Log;
import pageObjectModel.Login;
import pageObjectModel.MyStore;

public class CreateAccRunnerScript
{
	@Test
	public void accountCreate() throws IOException
	{	
		DriverSet.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		DriverSet.driver.get(Constant.url);
		
		Log.info("URL launched");
		
		DriverSet.driver.manage().window().maximize();
		
		Log.info("Window maximized");
		
		MyStore.lnk_Login(DriverSet.driver).click();
		
		Log.info("Clicked on Sign In");
		
		List<String> email = new ArrayList();
		
		email.add("diprocks@gmail.com");
		email.add("diprocks123@gmail.com");
		
		for(int i = 0;i<email.size();i++)
		{
			Login.txtBox_EmailAddress(DriverSet.driver).sendKeys(Keys.CONTROL+"a");
			
			Login.txtBox_EmailAddress(DriverSet.driver).sendKeys(Keys.DELETE);
			
			Login.txtBox_EmailAddress(DriverSet.driver).sendKeys(email.get(i));
		
			Log.info("Entered email address for TC"+(i+1));
			
			Login.btn_CreateAccount(DriverSet.driver).click();
			
			Log.info("Clicked on created account for TC"+(i+1));
		
			DriverSet.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			File srcFile = ((TakesScreenshot)DriverSet.driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile,new File(Constant.imagePath+"\\TC"+(i+1)+"_image.jpeg"));
			
			DriverSet.driver.navigate().back();
		}
	}
}