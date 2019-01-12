package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStore
{
	public static WebElement element = null;
	
	public static WebElement lnk_Login(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector(".login"));
		return element;
	}
	
	public static WebElement lnk_Contact(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='contact-link']/a"));
		return element;
	}
}
