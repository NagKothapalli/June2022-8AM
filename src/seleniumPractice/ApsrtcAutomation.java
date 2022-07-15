package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
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
	//UnChecked Exception - Run Time Exceptions : IndexOutofBounds , NullPointer , NoSuchElement 
	//Checked Exception - Compile Time Exception : FileNotFoundException ,IOException , InterruptedException
	@Test
	public void readPropertiesData() throws IOException
	{
		FileInputStream myFile = new FileInputStream("TestData/InputData.properties"); //Delivery Boy
		Properties prop = new Properties(); //News Reader
		prop.load(myFile); //News paper given to news reader
		String myurl = prop.getProperty("URL");
		System.out.println("url from prop file :" + myurl);
		String myusername = prop.getProperty("UserName");
		System.out.println("username from prop file :" + myusername);
		if(myusername.equals("nag"))
		{
			System.out.println("yes");
		}
	}
	public String readData(String mykey) throws IOException
	{
		FileInputStream myFile = new FileInputStream("TestData/InputData.properties"); //Delivery Boy
		Properties prop = new Properties(); //News Reader
		prop.load(myFile); //News paper given to news reader
		return prop.getProperty(mykey);
	}
	@Test
	public void launchApplication() throws IOException
	{
		//driver.get("https://www.apsrtconline.in/"); //Hard Coded values
		driver.get(readData("URL"));
	}
	@Test
	public void bookTicket() throws InterruptedException, IOException
	{
		launchApplication();
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(readData("FromCity")); 
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(readData("ToCity"));
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();	
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		String jdate = readData("JDate");
		driver.findElement(By.xpath("//a[text()='"+jdate+"']")).click(); //a[text()='22'] - Dynamic xpath
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	@Test
	public void keyboardOperations() throws IOException
	{
		launchApplication();
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']")); 
		Actions actions = new Actions(driver);
		//actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).doubleClick().contextClick().build().perform();
	}
	@Test
	public void workWithMultipleWindows() throws IOException
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
