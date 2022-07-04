package calculator;
//class extends class
public class MiniCalculator implements AirthmeticOperations
{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Mini");
	}
	public int addition(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	public int addition(int a,int b,int c)
	{
		int sum = a+b+c;
		return sum;
	}
	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int diff = a-b;
		return diff;
	}
	@Override
	public int multiplication(int a, int b) {
		int prod = a*b;
		return prod;
	}
	@Override
	public int division(int a, int b) {
		int div = a/b;
		return div;
	}
	
	
}
