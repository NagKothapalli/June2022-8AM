package generalStore;

import org.junit.Test;

import calculator.AirthmeticOperations;
import calculator.CommercialCalculator;
import calculator.MiniCalculator;
import calculator.ScientificCalculator;

public class CustomerBill
{
	@Test
	public void generateCustomerBill()
	{
		int prod1 = 34343434;
		int prod2 = 12354545;
		MiniCalculator mCalc = new MiniCalculator();
		CommercialCalculator cCalc = new CommercialCalculator();
		ScientificCalculator sCalc = new ScientificCalculator();
		AirthmeticOperations aCalc = new ScientificCalculator();
		//WebDriver driver = new ChromeDriver();
		//mCalc.displayLogo();
		//cCalc.displayLogo();		
		//aCalc.displayLogo();
		int bill = aCalc.addition(prod1, prod2);
		System.out.println("Bill Amount :"+ bill);
		//aCalc.sineValue();
	}

}
