import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**Class: StringSortDemo
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Mar 5, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class StringSortDemo
{

	public static void main(String[] args)
	{
		// Use a Scanner class to input 7 Strings
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> stringList = new ArrayList<String>();
		
		for (int i =0; i<7; i++)
		{
			System.out.println("Please enter a String:");
			String value = keyboard.nextLine();
			stringList.add(value);
		}
		
		System.out.println(stringList);
		// Display top 2 strings lexicographically
		
		// Step 1: After all the Strings have been entered, sort them
		Collections.sort(stringList);
		
		System.out.println("After sorting: " + stringList);
		
		// Step 2: SOP the top two elements
		System.out.println("Top element is: " + stringList.get(0));
		System.out.println("Next element is: " + stringList.get(1));
	}

}
