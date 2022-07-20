package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationUtilities
{
	WebDriver driver;
	Actions actions;
	WebDriverWait eWait;
	public ApplicationUtilities(WebDriver mydriver)
	{
		driver = mydriver;
		actions = new Actions(driver);
		eWait = new WebDriverWait(driver,25);
	}
	//******************************
		public void clickEnter()
		{
			actions.sendKeys(Keys.ENTER).perform();
		}
		WebElement element;
		public void myClick(String myxpath)
		{
			element = driver.findElement(By.xpath(myxpath));
			eWait.until(ExpectedConditions.elementToBeClickable(element));
			actions.moveToElement(element).click().build().perform();
		}
		public void mySendKeys(String myxpath,String txt)
		{
			element = driver.findElement(By.xpath(myxpath));
			eWait.until(ExpectedConditions.elementToBeClickable(element));
			actions.moveToElement(element).click().sendKeys(txt).build().perform();
		}
		public void myClick(WebElement element)
		{
			eWait.until(ExpectedConditions.elementToBeClickable(element));
			actions.moveToElement(element).click().build().perform();
		}
		public void mySendKeys(WebElement element,String txt)
		{
			eWait.until(ExpectedConditions.elementToBeClickable(element));
			actions.moveToElement(element).click().sendKeys(txt).build().perform();
		}
		//**********************************

}
