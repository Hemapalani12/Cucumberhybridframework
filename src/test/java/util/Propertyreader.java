package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Propertyreader {

	public static String readDataFromPropertyFile(String filename,String propertyKey) {
		File file= new File("./data/"+filename+".properties");
		FileInputStream fis;
		String value="";
		
		try
		{
			fis= new FileInputStream(file);
			Properties property = new Properties();
			property.load(fis);
			value=property.getProperty(propertyKey);
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

}
