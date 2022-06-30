package multilevelInheritance;

import org.junit.Test;
//             child              parent               grand-parent : child inherits grand-parent automatically
public class TestSuites extends TestCases   //extends ReusableComponents
{
	@Test
	public void smokeSuite()
	{
		System.out.println("TestSuite : SMOKE");
		//launchApplication();
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("TestSuite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}


}
