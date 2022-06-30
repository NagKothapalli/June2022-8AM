package heirarchialInheritance;

import org.junit.Test;
//              child                 parent
public class TestCases_M2 extends ReusableComponents
{
	/*
	 * protected void launchApplication() //overriding {
	 * System.out.println("RC : Launch Application from TestCases"); }
	 */
	//TestCase : TestSteps 
	
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

}
