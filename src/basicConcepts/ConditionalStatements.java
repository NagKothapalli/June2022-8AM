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
	
	//Write a program to read two inputs and perform addition if they are equal , if a >b then do subtraction , if a < b then do multiplication
	@Test
	public void multipleDecisions_test()
	{
		multipleDecisions(44,44); //code coverage = lines covered  /  Total Lines * 100  = 5/15 * 100  = 33.33333
		multipleDecisions(64,44);
		multipleDecisions(24,44);		
	}
	public void multipleDecisions(int a,int b)
	{
		System.out.println("First value :" + a);
		System.out.println("Second value :" + b);
		if(a==b)
		{
			int sum = a+b;
			System.out.println("Sum of two numbers :"+ sum);
		}
		else if(a>b)
		{
			int diff = a-b;
			System.out.println("Difference of two numbers :"+ diff);
		}
		else if(a<b)
		{
			int prod = a*b;
			System.out.println("Product of two numbers :"+ prod);
		}
	}
	
	//Write a program to read two inputs, perform the below task if and only if both inputs are above 10
	//Task : perform addition if they are equal , if a > b then do subtraction , if a < b then do multiplication
	@Test
	public void nestedConditions_test()
	{
		nestedConditions(4,8);
		nestedConditions(14,8);
		nestedConditions(4,48);
		nestedConditions(44,18);
		nestedConditions(44,44);
		nestedConditions(64,98);
	}
	public void nestedConditions(int a,int b)
	{
		System.out.println("First value :" + a);
		System.out.println("Second value :" + b);
		if((a>10) && (b>10))  // T  &&  T : T   // Logical Operator   // Outer condition
		{
			//true //Nested if  - inner condition
			if(a==b)  // == , <  , > : Relational Operators
			{
				int sum = a+b;  // =  : Assignment Operator
				System.out.println("Sum of two numbers :"+ sum);
			}
			else if(a>b)
			{
				int diff = a-b;  // + , - , * : Arithmetic Operators
				System.out.println("Difference of two numbers :"+ diff);
			}
			else if(a<b)
			{
				int prod = a*b;
				System.out.println("Product of two numbers :"+ prod);
			}
		}
		else
		{
			//false
			System.out.println("Both A and B or any one of them might be below 10");
		}
	}
	// Write a program to read a number as input and find that num is even or odd.
	@Test
	public void findEvenOdd_test()
	{
		findEvenOdd(16);
		findEvenOdd(99);
	}
	public void findEvenOdd(int a)
	{
		System.out.println("Given Number :" + a);
		//   num / 2  = Q   ,  num % 2  = R     5/2  - Q=2  R=1
		int rem = a % 2;
		if(rem == 0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
