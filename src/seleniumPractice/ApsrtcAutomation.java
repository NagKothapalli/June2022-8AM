package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	WebDriver driver; //null
	public ApsrtcAutomation()
	{
		System.out.println("GmailAutommation Default Constructor");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
	}
	@Test
	public void launchApplication()
	{
		driver.get("https://www.apsrtconline.in/");
	}
	@Test
	public void bookTicket() throws InterruptedException
	{
		launchApplication();
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD"); 
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();	
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='20']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	@Test
	public void keyboardOperations()
	{
		launchApplication();
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']")); 
		Actions actions = new Actions(driver);
		//actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).doubleClick().contextClick().build().perform();
	}
	@Test
	public void workWithMultipleWindows()
	{
		launchApplication();
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(allwindows);
		for(int i=0;i<windows.size();i++)
		{
			System.out.println(windows.get(i)); // i = 0 1
		}
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		//driver.close(); // it will close the current active window
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		driver.quit(); //it will close all the windows opened by the current webdriver
	}
	
	
	
	
	
	
	
	

}
