package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.RegistrationDetails;

public class Test2 extends RegistrationDetails
{
	@Test(priority = 1)
	public void FullName() throws Exception
	{
		WebElement element = fullname();
		String name = getproperty("name");
		element.sendKeys(name);
	}
	
	@Test(priority = 2, dependsOnMethods = "FullName")
	public void Email() throws Exception
	{
		WebElement element = email();
		String email = getproperty("email");
		element.sendKeys(email);
	}
	
	@Test(priority = 3, dependsOnMethods = "Email")
	public void Number() throws Exception
	{
		WebElement element = number();
		String ph = getproperty("phno");
		element.sendKeys(ph);
	}
	
	@Test(priority = 4, dependsOnMethods = "Number")
	public void Date() throws Exception
	{
		Select sl = date();
		String date = getproperty("date");
		sl.selectByVisibleText(date);
	}
	
	@Test(priority = 5, dependsOnMethods = "Date")
	public void Month() throws Exception
	{
		Select sl = month();
		String month = getproperty("month");
		sl.selectByVisibleText(month);
	}
	
	@Test(priority = 6, dependsOnMethods= "Month")
	public void Year() throws Exception
	{
		Select sl = year();
		String year = getproperty("year");
		sl.selectByVisibleText(year);
	}
	
	@Test(priority = 7, dependsOnMethods= "Year")
	public void Gender() throws Exception
	{
		Select sl = gender();
		String gender = getproperty("gender");
		sl.selectByValue(gender);
	}
	
	@Test(priority = 8, dependsOnMethods= "Gender")
	public void Create_New_Account_Button()
	{
		WebElement element = create_new_account_button();
		element.click();
	}
}
