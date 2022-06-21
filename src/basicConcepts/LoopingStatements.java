package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void applyColorToSteps()
	{
		System.out.println("Apply Color to Step 1");
		System.out.println("Apply Color to Step 2");
		System.out.println("Apply Color to Step 3");
		System.out.println("Apply Color to Step 4");
		System.out.println("Apply Color to Step 5");
		System.out.println("Apply Color to Step 6"); //..........
	}
	
	//iterator = value  ;  condition ; step size
	//for(int iterator = 1; i<40; i=i+n){  Task   }
	@Test
	public void applyColor()
	{
		for(int iterator=1;iterator<40;iterator=iterator+1) //1<40 2<40 3<40 4<40 5<40 ....39<40 40<40->F
		{
			//if condition is true then it will come here
			System.out.println("Apply Color to Step :" + iterator);  // 1 2 3 ...39 
		}
	}
	
	@Test
	public void applyColor_2()
	{
		for(int i=1;i<=40;i=i+1) //1<40 2<40 3<40 4<40 5<40 ....39<=40 40<=40->T  41<=40 ->F
		{
			//if condition is true then it will come here
			System.out.println("Apply Color to Step :" + i);  // 1 2 3 ...39 
		}
	}
	@Test
	public void applyColor_OddSteps()
	{
		for(int i=1;i<=40;i=i+2) // 1 3 5 7 9 ......
		{
			//if condition is true then it will come here
			System.out.println("Apply Red Color to Step :" + i);  // 1 3 5 7...39 
		}
	}
	//[34,67,23,7,89,454,67,34,7,43,65]
	@Test
	public void applyColor_EvenSteps()
	{
		for(int i=2;i<=100;i=i+2) // 2 4 6 8 10......
		{
			//if condition is true then it will come here
			System.out.println("Apply Green Color to Step :" + i);  // 1 3 5 7...39 
		}
	}
	@Test
	public void findEvenOdd()
	{
		for(int i=1;i<=100;i++)
		{
			if((i%2) == 0)
			{ //true
				System.out.println(i + " is Even");
			}
			else
			{
				System.out.println(i + "  is Odd");
			}
		}
	}
	@Test
	public void findEvenNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if((i%2) == 0)
			{ //true
				System.out.println(i + " is Even");
			}			
		}
	}
	
	@Test
	public void findOddNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if(!((i%2) == 0))
			{ //true
				System.out.println(i + " is Odd");
			}			
		}
	}
	
	@Test
	public void printHundredNumbers()
	{
		for(int i=1;i<=100;i=i+1) //1<40 2<40 3<40 4<40 5<40 ....39<=40 40<=40->T  41<=40 ->F
		{
			//if condition is true then it will come here
			System.out.println(i);  // 1 2 3 ...39 
		}
	}
	@Test
	public void findStudent()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Searching the student :" + i);
			if(i==242) //22 == 22
			{ //true
				System.out.println("Found the Student");
				break;
			}
		}
	}
	
	//Apply color to steps in five floors each floor having 20 steps , apply different color in each floor
	@Test
	public void applyColorToBuilding()
	{
		for(int i=1;i<=5;i++) //Outer loop
		{
			System.out.println("*********Apply color in the Floor :" + i);
			for(int j=1;j<=20;j++) //Inner loop
			{
				System.out.println("Apply color to Step :" + j);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
