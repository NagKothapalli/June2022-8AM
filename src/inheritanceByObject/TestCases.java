package inheritanceByObject;

import org.junit.Test;
//              child                 parent
public class TestCases //extends ReusableComponents
{
	//Modifier ClassName       objName  = new Constructor();
	//public ReusableComponents   rcObj    = new ReusableComponents();
	public ReusableComponents   rcObj    = new ReusableComponents("ie");
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
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.compose();
		rcObj.send();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}
	@Test
	public  void replyToAnEmail()
	{
		//launch , login , open , reply , logout , close
		System.out.println("Test Case : ReplyToAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.reply();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		//launch , login , open , reply , logout ,close
		System.out.println("Test Case : ForwardAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.forward();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		//launch , login , open , delete , logout , close
		System.out.println("Test Case : DeleteAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.delete();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}

}
