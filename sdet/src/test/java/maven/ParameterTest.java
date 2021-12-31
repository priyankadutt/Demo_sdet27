package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParameterTest {

	@Test
	public void Test1()
	{
		WebDriver driver;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equals("chrome"))
		{
			driver = new ChromeDriver();
		}else
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.quit();
	}
}
