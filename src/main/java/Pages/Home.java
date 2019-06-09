package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.Launch;

public class Home
{	
	public WebElement register()
	{
		WebElement element = Launch.driver.findElement(By.xpath("//a[@title='Register']"));
		return element;
	}
	
}
