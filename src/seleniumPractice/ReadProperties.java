package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties  //Utility class to read test data from different input data files
{
	String myPath;  //null
	public ReadProperties(String filePath)//Local variable
	{
		myPath = filePath;
	}
	public String readData(String mykey) throws IOException
	{
		FileInputStream myFile = new FileInputStream(myPath); //Delivery Boy
		Properties prop = new Properties(); //News Reader
		prop.load(myFile); //News paper given to news reader
		return prop.getProperty(mykey);
	}

}
