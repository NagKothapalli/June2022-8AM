package basicConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "         Selenium With Java              ";
	String b = "JAVA";
	String c = "    Selenium With JAVA                    ";
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("String length :"+len);
		String aT = a.trim();
		System.out.println("String Length after trim :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("String in lowercase :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String in Uppercase :" + aU);
	}
	@Test
	public void subStringOperation()
	{
		String a8 = a.trim().substring(8);
		System.out.println("string from 8th char :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("string from 0th - 8th :" + a08);
	}
	@Test
	public void stringContainsOperation()
	{
		String aTL = a.trim().toLowerCase();
		String bTL = b.trim().toLowerCase();
		boolean result = aTL.contains(bTL);  //true  | false
		if(result == true)
		{
			System.out.println("String a contains string b");
		}
		else
		{
			System.out.println("String a does not contain string b ");
		}
	}
	@Test
	public void stringEqualsOperation()
	{
		//Both must be strings , same in length , same in case sensitivity , same in character sequence[spelling]
		//String aTL = a.trim().toLowerCase();
		//String cTL = c.trim().toLowerCase();
		//boolean result = aTL.equals(cTL);  // true | false
		boolean result = a.trim().equalsIgnoreCase(c.trim());  // true | false
		if(result == true)
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
	}
	
	//split , concatenation , charAt
	
	String d = " Selenium Automation With Java";
	@Test
	public void stringCharacterAtOperation()
	{		
		char c0 = d.trim().charAt(0);
		System.out.println("Character at 0 index :" + c0);
		for(int i=0;i<d.trim().length();i++)
		{
			char ci = d.trim().charAt(i);
			System.out.println("Char at i th place :" + ci);
			if(ci == 'a')
			{
				System.out.println(" Char a is present in the main string");
				break;
			}
		}		
	}
	@Test
	public void stringCharacterCount()
	{
		int count = 0;
		for(int i=0;i<d.length();i++)
		{
			char ci = d.charAt(i);
			System.out.println("Char at "+ i +" th place :" + ci);
			if(ci=='a' || ci=='A')
			{
				count++;
			}
		}
		System.out.println("Char a count :"+ count);
	}
	
	//string + string = string ,  string+int |  int+string = string  ,  int + int = int
	@Test
	public void stringConcatenation()
	{
		System.out.println("Selenium" + "Java");
		System.out.println("Selenium" + 22);
		System.out.println(44 + "Selenium" + "Java");
		System.out.println(22 + 44 + "Selenium" + 55 + "Java");
		System.out.println(a.concat(d));
	}
	
	
	
	
	

}
