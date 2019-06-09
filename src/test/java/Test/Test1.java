package Test;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.Home;

public class Test1 extends Home
{
		@Test(priority = 1)
	public void Registration()
	{
		WebElement element =register();
		element.click();
	}
}
