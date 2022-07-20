package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation //extends ReadProperties
{
	WebDriver driver; //null
	ReadProperties prop;
	Actions actions;
	WebDriverWait eWait;
	ApplicationUtilities appUtils;
	public ApsrtcAutomation()
	{
		System.out.println("GmailAutommation Default Constructor");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		prop = new ReadProperties("TestData/DevData.properties");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		actions = new Actions(driver);
		eWait = new WebDriverWait(driver,25);
		appUtils = new ApplicationUtilities(driver);
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
	
	@Test
	public void launchApplication() throws IOException
	{
		//driver.get("https://www.apsrtconline.in/"); //Hard Coded values
		//prop.readData(null);
		driver.get(prop.readData("URL"));
	}
	//Synchronization : 
	  // Static wait - Thread.sleep()
	 // ImplicitlyWait
	  // Explicit Wait with WebDriverWait class
	@Test
	public void bookTicket() throws InterruptedException, IOException
	{
		
		launchApplication();		
		//Thread.sleep(24000);
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys(prop.readData("FromCity")); 		
		WebElement sourceCity = driver.findElement(By.xpath("//input[@name='source']"));
		eWait.until(ExpectedConditions.elementToBeClickable(sourceCity));
		actions.moveToElement(sourceCity).click().sendKeys(prop.readData("FromCity")).build().perform();;		
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(prop.readData("ToCity"));
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();	
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		String jdate = prop.readData("JDate");
		driver.findElement(By.xpath("//a[text()='"+jdate+"']")).click(); //a[text()='22'] - Dynamic xpath
		WebElement searchButton = driver.findElement(By.xpath("//input[@name='searchBtn']"));
		actions.moveToElement(searchButton).click().build().perform();
	}
	@Test
	public void bookTicket_New() throws InterruptedException, IOException
	{		
		launchApplication();
		appUtils.mySendKeys("//input[@name='source']",prop.readData("FromCity"));			
		Thread.sleep(1000);
		appUtils.clickEnter();
		appUtils.mySendKeys("//input[@name='destination']",prop.readData("ToCity"));	
		Thread.sleep(1000);
		appUtils.clickEnter();
		appUtils.myClick("//input[@name='txtJourneyDate']");
		String jdate = prop.readData("JDate");
		appUtils.myClick("//a[text()='"+jdate+"']");
		appUtils.myClick("//input[@name='searchBtn']");
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
	@Test
	public void bookTicket_DataDriven() throws InterruptedException, IOException
	{
		launchApplication();
		String[] fCities = prop.readData("FromCities").split(",");
		System.out.println("Total Cities :" + fCities.length);
		String[] tCities = prop.readData("ToCities").split(",");
		String[] jDates = prop.readData("JDates").split(",");
		for(int i=0;i<fCities.length;i++)
		{
			System.out.println("Iteration :" + i);
			driver.findElement(By.xpath("//input[@name='source']")).sendKeys(fCities[i]); 
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.sendKeys(Keys.ENTER).perform();
			driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(tCities[i]);
			Thread.sleep(1000);
			actions.sendKeys(Keys.ENTER).perform();	
			driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
			//String jdate = prop.readData("JDate");
			driver.findElement(By.xpath("//a[text()='"+jDates[i]+"']")).click(); //a[text()='22'] - Dynamic xpath
			driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//a[@title='Home']")).click();
		}
	}
	
	
	
	
	
	

}
