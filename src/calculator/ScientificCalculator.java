package calculator;
//class implements interface
public class ScientificCalculator implements AirthmeticOperations,TrigonametricOperations
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

	@Override
	public void sineValue() {
		System.out.println("SINE VALUE");
		
	}

	@Override
	public void cosineValue() {
		System.out.println("COSINE VALUE");
		
	}

	@Override
	public void coSecValue() {
		System.out.println("COSEC VALUE");
		
	}

}
