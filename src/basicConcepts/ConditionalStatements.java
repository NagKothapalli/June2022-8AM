package basicConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//Modifier[opt]    DataType  Name = value ;  - variable
	//Modifier[opt]    ReturnType  Name(){  body }  - function
	
	public int a = 22;
	public int b = 22;
	//a+b = c+d -> LHS = RHS ->true
	//if(expression -> boolean : true | false){ Task }
	@Test
	public void compareNumbers_if()
	{
		if(a==b) //true
		{
			System.out.println("Both A and B are equal");
		}
	}
	
	@Test
	public void compareNumbers_ifelse()
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(a==b) //true
		{
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}
	@Test
	public void compareNumbers_ifelse_test() //Unit Test
	{
		compareNumbers_ifelse(26,26);
		compareNumbers_ifelse(44,24);
	}
	public void compareNumbers_ifelse(int x,int y) //Dev code
	{
		System.out.println("First value :" + x);
		System.out.println("Second value :" + y);
		if(x==y) //true
		{
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
