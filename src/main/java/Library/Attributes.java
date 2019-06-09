package Library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributes 
{
	
	public String getproperty(String property) throws Exception
	{
		
	FileReader read = new FileReader("C:\\Users\\vipul\\eclipse-workspace\\Maven\\src\\Global.properties");
	Properties pr = new Properties();
	pr.load(read);
	String result = pr.getProperty(property);
	return result;
	}
}
