import java.io.IOException;
import java.util.Properties;

import org.omg.CORBA_2_3.portable.InputStream;

public class PhoneDirectory
{
	private String name;
	private String number;
	private String path = null;
	
	Properties prop = new Properties();
	prop.store(new FileWriter("phone.properties"), "Example line./n");
	
	// TRY / CATCH
	public PhoneDirectory()
	{
		InputStream prop_input = null;
		
		try
		{
			prop_input = new FileInputStream("src/main/resources/phone.properties");
			prop.load(prop_input);
			path = prop.getProperty("path");
		}
		catch (IOException err)
		{
			err.printStackTrace();
		}
		finally
		{
			if (prop_input != null)
				try
				{
					prop_input.close();
				}
				catch (IOException err)
				{
					err.printStackTrace();
				}
		}
	}
	
	// FUNCTIONS
	public void addEntry (String name, String number)
	{
		prop.setProperty(name, number);
	}
	
	public void deleteEntry (String name)
	{
		prop.remove(name);
	}
	
	public String getNumber (String name)
	{
		prop.load(new FileReader("phone.properties"));
		String value = prop.getProperty(name);
		System.out.println(value);
	}
	
	public void changeEntry (String name, String number)
	{
		prop.remove(name);
		prop.setProperty(name, number);
	}
	
}
