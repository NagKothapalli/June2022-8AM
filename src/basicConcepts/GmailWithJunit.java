package basicConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//TestCase : TestSteps 
	@Test  // Junit will treat it as a test method
	public  void composeAndSendAnEmail()
	{
		//Step 1.1 :launch ,  Step 1.2 : login , step 1.3 : compose  step 1.4 : send step 1.5 : logout step 1.6 : close
		System.out.println("Test Case : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void replyToAnEmail()
	{
		//launch , login , open , reply , logout , close
		System.out.println("Test Case : ReplyToAnEmail");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		//launch , login , open , reply , logout ,close
		System.out.println("Test Case : ForwardAnEmail");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		//launch , login , open , delete , logout , close
		System.out.println("Test Case : DeleteAnEmail");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	//*******************ReUsable Component *****************************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//Launch process selenium code
		//open browser
		//call url
		//maximize
		//title validation
		//check url
	}	
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
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
	public void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	public void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
