/**Class: NameSorter
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Jan 31, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

import java.util.Scanner;

public class NameSorter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Input name1 as String
		System.out.println("Please enter name1");
		String name1 = keyboard.nextLine();
		
		// Input name2 as String
		System.out.println("Please enter name2");
		String name2 = keyboard.nextLine();
		
		
		// Display which name comes first
		if ( name1.compareTo(name2) > 0)
		{
			System.out.println("Name1 comes AFTER Name2");
			System.out.println("Name2 comes BEFORE Name1");
		}
		else if ( name1.compareTo(name2) < 0)
		{
			System.out.println("Name1 comes BEFORE Name2");
		}
		else
		{
			System.out.println("Name1 equals Name2");
		}
		

	}

}