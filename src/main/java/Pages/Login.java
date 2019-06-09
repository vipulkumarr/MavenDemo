package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.Attributes;
import Test.Launch;

public class Login extends Attributes
{

	public WebElement login()
	{
		WebElement element = Launch.driver.findElement(By.xpath("//a[@title='Login']"));
		return element;
	}
	
	public WebElement email()
	{
		WebElement element = Launch.driver.findElement(By.id("edit-name"));
		return element;
	}
	
	public WebElement pass()
	{
		WebElement element = Launch.driver.findElement(By.id("edit-pass"));
		return element;
	}
	
	public WebElement login_button()
	{
		WebElement element = Launch.driver.findElement(By.id("edit-submit"));
		return element;
	}
	
	public WebElement logout_img()
	{
		WebElement element = Launch.driver.findElement(By.xpath("//img[@alt='user picture']"));
		return element;
	}
	
	public WebElement logout_link()
	{
		WebElement element = Launch.driver.findElement(By.xpath("//a[@title='log out']"));
		return element;
	} 
}
