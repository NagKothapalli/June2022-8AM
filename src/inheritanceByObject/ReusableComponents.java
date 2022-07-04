package inheritanceByObject;

import org.junit.Test;

public class ReusableComponents
{
	public ReusableComponents() //Default
	{
		System.out.println("Clean the Data Base");
		System.out.println("Open default browser : CHROME");
	}
	public ReusableComponents(String browser)
	{
		System.out.println("Clean the Data Base");
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.out.println("Open Chrome Browser");
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.out.println("Open Firefox Browser");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("Open IE Browser");
		}
	}
	
	//*******************ReUsable Component *****************************
	protected void  launchApplication()
	{
		System.out.println("RC : Launch Application from ReusableComponents");
		//Launch process selenium code
		//open browser
		//call url
		//maximize
		//title validation
		//check url
	}	
	void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	protected void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}
	void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	protected void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}
	

}
