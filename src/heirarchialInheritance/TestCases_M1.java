package heirarchialInheritance;

import org.junit.Test;
//              child                 parent
public class TestCases_M1 extends ReusableComponents
{
	/*
	 * protected void launchApplication() //overriding {
	 * System.out.println("RC : Launch Application from TestCases"); }
	 */
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
	

}
