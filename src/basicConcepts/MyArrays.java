package basicConcepts;

import org.junit.Test;

public class MyArrays
{
	//Modifier[opt]   DataType  Name = value;
	public int stdNum = 22;
	public int stdNum2 = 23;
	public int stdNum3  = 25;
	//Modifier[opt]   DataType[]  Name = {value...};
	//java.lang.ArrayIndexOutOfBoundsException: 9
	@Test
	public void fixedArray_integer()
	{
		//local variable should not have any access modifier- private , default , protected , public
		//             0  1  2 3  4   5  6  7  8   - 9
		int[] numbers = {45,23,6,23,78,98,54,32,76};   //declaration , assignment ,length , read elements , write elements
		int len = numbers.length; //9
		System.out.println("Array Length :" + len);
		int value = numbers[8]; // reading the values
		numbers[0] = 99; //writing the value
		for(int i=0;i<=len;i++) // 0-8 -> 9  [<=] 0-9 -> 10
		{
			value = numbers[i]; // 0....8 [9] - IndexOutofBounds exception
			System.out.println("Elements in the array :"+ value);
		}		
	}
	@Test
	public void fixedArray_string()
	{
		//local variable should not have any access modifier- private , default , protected , public
		//             0  1  2 3  4   5  6  7  8   - 9
		//int[] names = {45,23,6,23,78,98,54,32,76};   //declaration , assignment ,length , read elements , write elements
		String[] names = {"Ram","Ravi","Raj","Rajesh"};
		int len = names.length; //9
		System.out.println("Array Length :" + len);
		String value = names[3]; // reading the values
		names[0] = "Ramesh"; //writing the value
		for(int i=0;i<=len;i++) // 0-8 -> 9  [<=] 0-9 -> 10
		{
			value = names[i]; // 0....8 [9] - IndexOutofBounds exception
			System.out.println("Elements in the array :"+ value);
		}		
	}


}

