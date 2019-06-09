package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Library.Attributes;

public class Launch  extends Attributes
{
	public  static WebDriver driver;
	@Parameters("browser")
  @Test
  public void LaunchBrowser(String browser) throws Exception 
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.out.println(browser);
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vipul\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	 String url = getproperty("url");
	 driver.get(url);
	  }
	  
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.out.println(browser);
		  System.setProperty("webdriver.gecko.driver","G:\\selenium\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		 String url = getproperty("url");
		 driver.get(url);
	  }
  }
}
