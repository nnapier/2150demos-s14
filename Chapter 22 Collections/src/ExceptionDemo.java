import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ExceptionDemo
{
	public enum BookType
	{
		MYSTERY, DRAMA, COMPUTING;
		public static BookType getEnum(String str)
		{
			BookType result = COMPUTING;
			
			// HINT #1: DO THE WORK HERE!!!!
			// HINT #2: Remember that BookType.valueOf(str)
			//          will already convert from String --> enum
			try
			{
				result = BookType.valueOf(str);
			}
			catch(NullPointerException exc)
			{
				// Set the BookType to COMPUTING if a null
				// parameter is passed
				result = COMPUTING;
			}
			catch(IllegalArgumentException exc)
			{
				// Set the BookType to MYSTERY if an unrecognized
				// string is passed in
				result = MYSTERY;
			}
			return result;
		}
	}
	public static void input4Numbers()
	{
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < 4; i++)
		{
			try
			{
				System.out.println("Input a number: ");
				int num = keyboard.nextInt();
				numList.add(num);
			}
			catch(InputMismatchException exc)
			{
				// Print the exception information
				exc.printStackTrace();
				
				// Add a default value of 0 to the arrayList
				numList.add(0);
				
				// SOP a message that you are using a default value
				System.out.println("Invalid info: using default value");
				
				// Read the newline character
				keyboard.nextLine();
			}
			catch(NoSuchElementException exc)
			{
				System.err.println("No Such Element EXCEPTION!!!");
			}
			catch(IllegalStateException exc)
			{
				System.err.println("The scanner is closed!!!");
			}
		}
		System.out.println("The biggest number in the list: " 
				+ Collections.max(numList));
	}

	public static void practiceEnumConversion()
	{
		System.out.println("Book type for COMPUTING is: " +
				BookType.getEnum("COMPUTING"));
		System.out.println("Book type for DRAMA is: " +
				BookType.getEnum("DRAMA"));
		System.out.println("Book type for BAD is: " +
				BookType.getEnum("BAD"));
		System.out.println("Book type for null is: " +
				BookType.getEnum(null));
	}
	
	
	
	public static void main(String[] args)
	{
		practiceEnumConversion();
		// input4Numbers();
	}

}
