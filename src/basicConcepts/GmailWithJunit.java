package basicConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	@Test  // Junit will treat it as a test method
	public  void composeAndSendAnEmail()
	{
		System.out.println("Test Case : ComposeAndSendAnEmail");
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("Test Case : ReplyToAnEmail");
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : ForwardAnEmail");
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : DeleteAnEmail");
	}

}
