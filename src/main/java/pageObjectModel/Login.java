package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
	public static WebElement element = null;
	
	public static WebElement txtBox_EmailId(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("#email"));
		return element;
	}
	
	public static WebElement txtBox_Password(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("#passwd"));
		return element;
	}
	
	public static WebElement btn_Submit(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("#SubmitLogin"));
		return element;
	}
	
	public static WebElement txtBox_EmailAddress(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='email_create']"));
		return element;
	}
	
	public static WebElement btn_CreateAccount(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("#SubmitCreate"));
		return element;
	}
}
