package basicConcepts;

//Signature : CLASS
     //Modifier   class   Name{   body -> variables | functions  }
     //Access Modifiers : private , default , protected , public
     //NonAccess Modifiers : static , final
public class CoreConcepts
{
	//Naming Conventions : It must start with upper case letter , no spaces with in the class name , no special characters
	//Members - variables / functions
	
//Signature : VARIABLE
	//Modifier[opt]    DataType    Name; - Declaration           Modifier    DataType    Name  = value ;   - Assign
	private  int  stdNum = 22;
	         String stdName = "Ram";  //default
	public double  stdMarks = 94;
	protected char   stdGrade = 'A';
	public boolean stdResult = true;
	public static final String collegeName = "JNTU";	
	String name = collegeName;
//Signature : METHOD / FUNCTION
	//Modifier[opt]  ReturnType  Name(arguments.....){ body }
	          // yes - type [int , string , char]
		      // no  - void
	//psvm
	public static void main(String[] args)
	{
		System.out.println("Welcome to Selenium Java Automation");
		addition();
		addition(44,66);
		addition(44,86);
		addition(44,86,56);
		addition(444,86,566);
	}
	//
	public static void addition() // 0 0 , 0 1 , 1 0 , 1 1
	{
		int sum = 22+25; //Hard Coded
		//System.out.println("Sum of two numbers :  sum ");
		System.out.println("Sum of two numbers : " + sum);
	}	
	public static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum of two numbers Dynamic : " + sum);
	}
	public static void addition(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println("Sum of three numbers Dynamic : " + sum);
	}

}

class Yahoo
{
	
		String college = CoreConcepts.collegeName ;
	
}

class Amazon
{
	
}
