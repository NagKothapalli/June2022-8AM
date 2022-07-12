package seleniumPractice;

import java.util.ArrayList;
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
	WebDriver driver; //null
	public GmailAutomation()
	{
		System.out.println("GmailAutommation Default Constructor");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
	}
	//java.lang.NullPointerException

	//java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property
	
	//org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 103
	    //Current browser version is 90.0.4430.212 with binary path C:\Program Files 
	
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#identifierId"}
	
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#abcdefgh"}
	
	//org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
	//Locators / Selectors : ID , NAME , CLASSNAME , LINKTEXT , PARTIALLINKTEXT , TAGNAME , Xpath,cssSelector
	@Test
	public void launchApplication() //Test1
	{
		System.out.println("Launch Application");		
		//ChromeDriver driver = new ChromeDriver();//opens an empty chrome browser window //Session ID				
		driver.get("https://gmail.com");
		String session = driver.getWindowHandle();
		System.out.println("window session ID:"+session);
		String cUrl = driver.getCurrentUrl();
		System.out.println("Current URL :" + cUrl);
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title :" + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle); //Validation or Assertion
		//WebElement emailObj = driver.findElement(By.name("identifier")); //identifierId		
	}
	@Test
	public void loginToApplication() //Test2
	{
		launchApplication();
		//WebElement emailObj = driver.findElement(By.id("identifierId"));
		WebElement emailObj = driver.findElement(By.xpath("//input[@name='identifier' or @id='identifierId']"));
		emailObj.click();
		emailObj.sendKeys("dsfdsgfgfghgfhgg");
		emailObj.clear();
		emailObj.sendKeys("nag022");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//WebElement element = elements.get(1);		
		//element.click();
		for(int i=0;i<elements.size();i++)
		{
			String txt = elements.get(i).getText();
			System.out.println("Objects searched :" + txt);
			if(txt.equals("Next"))
			{
				elements.get(i).click();
				break;
			}
		}
	}
	//Execution Sequence : Constructor  -> Launch -> ForGotEmail
	
	//Static / fixed / Absolute : /html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button
	//Relative Xpath is like SQL Select query : select Salary from Employees where Name='Ram';
	
    //tagName[@attribute='value']
	//tagName[text()='value']
	//tagName[@att1='value' and @att2='value']
	//tagName[@att1='value' and text()='value']
	//tagName[@att1='value' or @att2='value']
	//tagName[@att1='value' or text()='value']
	
	//tagName[contains(@attribute,'value')]
	//tagName[contains(text(),'value')]
	//tagName[contains(@att1,'value') and @att2='value']
	//tagName[@att1='value' and contains(text(),'value')]
	//tagName[contains(@att1,'value') or @att2='value']
	//tagName[@att1='value' or contains(text(),'value')]
	
	//*[@attribute='value']
	//*[text()='value']
	//*[@att1='value' and @att2='value']
	//*[@att1='value' and text()='value']
	//*[@att1='value' or @att2='value']
	//*[@att1='value' or text()='value']
	
	//*[contains(@attribute,'value')]
	//*[contains(text(),'value')]
	//*[contains(@att1,'value') and @att2='value']
	//*[@att1='value' and contains(text(),'value')]
	//*[contains(@att1,'value') or @att2='value']
	//*[@att1='value' or contains(text(),'value')]
	
	@Test
	public void forgotMyEmail()
	{
		launchApplication();
		System.out.println("User ForGot his Email");
		//driver.findElement(By.tagName("button")).click(); //Forgot email? Create account
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("button"));
		 * for(int i=0;i<elements.size();i++) { String txt = elements.get(i).getText();
		 * if(txt.equals("Forgot email?")) { elements.get(i).click(); break; } }
		 */
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
	    //driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
	    //driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		//driver.findElement(By.xpath("//button[@type='button' and @jsname='Cuz2Ue' ]")).click();
		driver.findElement(By.xpath("//button[@type='button' and text()='Forgot email?' ]")).click();
	}
	
	@Test
	public void createMyAccount()
	{
		launchApplication();
		System.out.println("User ForGot his Email");
		//driver.findElement(By.tagName("button")).click(); //Forgot email? Create account
		List<WebElement> elements = driver.findElements(By.tagName("button"));
		for(int i=0;i<elements.size();i++)
		{
			String txt = elements.get(i).getText();
			System.out.println("Objects searched :" + txt);
			if(txt.equals("Create account"))
			{
				elements.get(i).click();
				break;
			}
		}
	}
	
	
	@Test
	public void userLearnMore()
	{
		launchApplication();
		System.out.println("User ForGot his Email");
		//driver.findElement(By.tagName("button")).click(); //Forgot email? Create account
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { String txt = elements.get(i).getText();
		 * System.out.println("Objects searched :" + txt); if(txt.equals("Learn more"))
		 * { elements.get(i).click(); break; } }
		 */
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
	}
	@Test
	public void findAllLinks()
	{
		ArrayList<String>  myurls = new ArrayList<String>();
		launchApplication();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			String url = elements.get(i).getAttribute("href");
			System.out.println("URL of link :" + url);
			myurls.add(url);			
		}
		for(int j=0;j<myurls.size();j++)
		{
			driver.get(myurls.get(j));
			String title = driver.getTitle();
			System.out.println("My Title : "+ title);
		}
		
	}
	
	@Test
	public void help()
	{
		launchApplication();
		System.out.println("User ForGot his Email");
		//driver.findElement(By.tagName("button")).click(); //Forgot email? Create account
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { String txt = elements.get(i).getText();
		 * System.out.println("Objects searched :" + txt); if(txt.equals("Help")) {
		 * elements.get(i).click(); break; } }
		 */
		driver.findElement(By.xpath("//a[text()='Help']")).click();
	}
	@Test
	public void privacy()
	{
		launchApplication();
		System.out.println("User ForGot his Email");
		//driver.findElement(By.tagName("button")).click(); //Forgot email? Create account
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { String txt = elements.get(i).getText();
		 * System.out.println("Objects searched :" + txt); if(txt.equals("Privacy")) {
		 * elements.get(i).click(); break; } }
		 */
		driver.findElement(By.linkText("Privacy")).click();
	}
	@Test
	public void terms()
	{
		launchApplication();
		System.out.println("User ForGot his Email");
		//driver.findElement(By.tagName("button")).click(); //Forgot email? Create account
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			String txt = elements.get(i).getText();
			System.out.println("Objects searched :" + txt);
			if(txt.equals("Terms"))
			{
				elements.get(i).click();
				break;
			}
		}
	}
	
	
	

}
