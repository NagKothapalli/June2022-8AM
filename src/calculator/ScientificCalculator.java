package calculator;
//class implements interface
public class ScientificCalculator implements AirthmeticOperations
{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Scientific");
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return (a+b+c);
	}

}
