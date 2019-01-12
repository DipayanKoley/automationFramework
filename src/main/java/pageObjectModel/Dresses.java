package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Dresses
{
	public static WebElement element = null;
	
	public static WebElement img_DressType(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//li/div/a[@title='Casual Dresses']"));
		return element;
	}
	
	public static WebElement checkBox_Size(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class='layered_filter'][1]/ul/li[1]/input"));
		return element;
	}
	
	public static WebElement hover_Container(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class='color-list-container']/ul"));
		return element;
	}
	
	public static WebElement btn_AddToCart(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//a[@data-id-product='3']/span"));
		return element;
	}
}