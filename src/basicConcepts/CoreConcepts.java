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
		addition(45,"Selenium");
		addition(22,32,42,52);		
		fundTransfer(567,123,4000);//from,to,amount
		int empSal = employeeSalary(18000,8000,12000); //basic,hra,hike
		System.out.println("Credit the Salary :" + empSal);
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
		int abc = a+b; //int+int = int
		System.out.println("Sum of two numbers Dynamic : " + abc);
	}
	public static void addition(int a,String b)
	{
		String sum = a+b; //int+string  string+int  string+string = string
		System.out.println("Sum of two numbers Dynamic : " + sum);
	}
	public static void addition(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println("Sum of three numbers Dynamic : " + sum);
	}
	public static void addition(int x,int y,int z,int w)
	{
		int sum = x+y+z+w;
		System.out.println("Sum of three numbers Dynamic : " + sum);
	}
	
	public static int employeeSalary(int basic,int hra,int hike)
	{
		int sal = basic+hra+hike;
		return sal;
	}
	
	public static void fundTransfer(int fromAcc,int toAcc,int amount )
	{
		System.out.println("From account :" + fromAcc);
		System.out.println("To account :" + toAcc);
		System.out.println("Amount :" + amount);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

class Yahoo
{
	
		String college = CoreConcepts.collegeName ;
	
}

class Amazon
{
	
}
