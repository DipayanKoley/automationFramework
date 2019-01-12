package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order
{
	public static WebElement element = null;
	
	public static WebElement icon_Quantity(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		return element;
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector(".logout"));
		return element;
	}
}
