package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.Attributes;
import Test.Launch;

public class RegistrationDetails extends Attributes

{
public WebElement fullname()
	{
	WebElement element = null;
	try
	{
		//WebDriverWait wait = new WebDriverWait(Launch.driver,3000);
		//wait.until(ExpectedConditions.visibilityOf(Launch.driver.findElement(By.id("edit-full-name"))));
		 element  = Launch.driver.findElement(By.xpath("//input[@id='edit-full-name']"));
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		return element;
	}
	
	public WebElement email()
	{
		WebElement element = Launch.driver.findElement(By.id("edit-email"));
		return element;
	}
	
	public WebElement number()
	{
		WebElement element = Launch.driver.findElement(By.id("edit-number"));
		return element;
	}
	
	public Select date()
	{
		Select   sl = new Select(Launch.driver.findElement(By.id("edit-links-fieldset-date")));
		return sl;
	}
	
	public Select month()
	{
		return(new Select(Launch.driver.findElement(By.id("edit-links-fieldset-month"))));
	}
	
	public Select year()
	{
		return(new Select(Launch.driver.findElement(By.id("edit-links-fieldset-year"))));
	}
	
	public Select gender()
	{
		return(new Select(Launch.driver.findElement(By.id("edit-gender"))));
	}
	
	public WebElement create_new_account_button()
	{
		WebElement element  = Launch.driver.findElement(By.id("edit-submit"));
		return element;
		
	}
}
