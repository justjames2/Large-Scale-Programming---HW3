package test;

import java.io.IOException;
import main.java.*;

public class main
{
	public static void main(String[] args)
	{
		// Variables
		PhoneDirectory myDirectory = new PhoneDirectory();
		
		String name_to_find = "James";
		String name_to_delete = "Angel";
		String name_to_add = "Mia";
		String number_to_add = "7136009191";
		String name_to_change = "Alanna";
		String number_to_change = "4445556666";
		
		// Test addEntry
		myDirectory.addEntry(name_to_add, number_to_add);
		
		// Test getNumber
		String number = myDirectory.getNumber(name_to_find);
		System.out.println("James' number: " + number);
		
		// Test changeEntry
		myDirectory.changeEntry(name_to_change, number_to_change);
		
		// Test deleteEntry
		try
		{
			myDirectory.deleteEntry(name_to_delete);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			myDirectory.deleteEntry(name_to_add);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		// Test addEntry after being deleted
		myDirectory.addEntry(name_to_delete, "1112223333");	
	}
}
