package seleniumPractice;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	String expectedTitle = "Gmail";
	//java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property
	
	//org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 103
	    //Current browser version is 90.0.4430.212 with binary path C:\Program Files 
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();//opens an empty chrome browser window //Session ID
		WebDriver driver = new ChromeDriver();		
		driver.get("https://gmail.com");
		String session = driver.getWindowHandle();
		System.out.println("window session ID:"+session);
		String cUrl = driver.getCurrentUrl();
		System.out.println("Current URL :" + cUrl);
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title :" + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle); //Validation or Assertion
		//WebElement emailObj = driver.findElement(By.name("identifier")); //identifierId
		WebElement emailObj = driver.findElement(By.id("identifierId"));
		emailObj.click();
		emailObj.sendKeys("dsfdsgfgfghgfhgg");
		emailObj.clear();
		emailObj.sendKeys("nag022");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		WebElement element = elements.get(1);
		element.click();
	}

}
