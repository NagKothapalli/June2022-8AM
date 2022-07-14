package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusAutomation
{
	WebDriver driver; //null
	Actions actions;
	public RedBusAutomation()
	{
		System.out.println("GmailAutommation Default Constructor");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		actions = new Actions(driver);
		driver.manage().window().maximize();
	}
	//org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element is not clickable at point (1180, 29)
	//org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds
	@Test
	public void launchApplication()
	{
		driver.get("https://www.redbus.in/");
	}
	@Test
	public void loginToApplication()
	{
		launchApplication();
		//cssSelector : we can identify the object with ID , Name , Class , combination of both tag and id  or tag and class
		//cssSelector : ID -> #  , class -> .
		WebElement loginDropDown = driver.findElement(By.cssSelector("#sign-in-icon-down"));
		actions.moveToElement(loginDropDown).click().build().perform();
		driver.findElement(By.cssSelector("#signInLink")).click();
		WebElement myframe = driver.findElement(By.xpath("//div[@class='modal']//iframe")); //div.modal
		driver.switchTo().frame(myframe);
		int count = driver.findElements(By.cssSelector("input#mobileNoInp")).size();
		System.out.println("my count :" + count);
		driver.findElements(By.cssSelector("input#mobileNoInp")).get(0).sendKeys("9959775757");
		driver.switchTo().defaultContent();
	}
	@Test
	public void moveToElement()
	{
		launchApplication();
		WebElement indiaIcon = driver.findElement(By.cssSelector(".icon-IND"));
		actions.moveToElement(indiaIcon).build().perform();
	}
	
	
	
	
	
	
	
	
	

}
