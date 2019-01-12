package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount
{
	public static WebElement element = null;
	
	public static WebElement lnk_Dresses(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div/ul/li/a[@title='Dresses' and text()='Dresses']"));
		return element;
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector(".logout"));
		return element;
	}
}
