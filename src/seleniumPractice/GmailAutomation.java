package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //Session ID
		driver.get("https://gmail.com");
	}

}
