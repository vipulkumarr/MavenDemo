package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.Login;

public class Test3 extends Login
{
	@Test(priority=1)
	public void Login_link()
	{
		WebElement element = login();
		element.click();
	}
	
	@Test(priority = 2)
	public void Email() throws Exception
	{
		WebElement element = email();
		String email = getproperty("phno");
		element.sendKeys(email);
	}
	
	@Test(priority = 3)
	public void Password() throws Exception
	{
		WebElement element = pass();
		String pass = getproperty("pass");
		element.sendKeys(pass);
	}
	
	@Test(priority = 4)
	public void Login_Button()
	{
		WebElement element = login_button();
		element.click();
	}
	
	@Test(priority = 5)
	public void Logout_Img()
	{
		WebElement element = logout_img();
		element.click();
	}
	
	@Test(priority = 6)
	public void Logout_Link()
	{
		WebElement element = logout_link();
		element.click();
	}
}
