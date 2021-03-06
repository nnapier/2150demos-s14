import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**Class: DelimiterTester
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Apr 9, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class DelimiterTester
{
	public static ArrayList<String> displayByDelimiter(String filename, 
			String delimiter)
			{
		ArrayList<String> wordList = new ArrayList<String>();

		// NOTE: Declaring the input OUTSIDE of the try so
		//       that it is accessible by the finally part of the clause
		Scanner input = null;
		try
		{
			// USE try-catch block since we don't want to throw FNF exception
			// Step 1: Create the File object
			File myFile = new File(filename);

			// Step 2: Create the Scanner Object
			input = new Scanner(myFile);

			// Step 3: Set the delimiter (input.useDelimiter(delimiter))
			input.useDelimiter(delimiter);

			// Step 4: Use a while loop (hasNext() --> next())
			//         Inside the while loop, add the String to the wordList

			while (input.hasNext())
			{
				String word = input.next();
				wordList.add(word);
			}
		}
		catch(FileNotFoundException exc)
		{
			System.err.println("Sorry, could not read the file" + exc);
		}
		catch(Exception exc)
		{
			// Catch any other types of exceptions not specified above
			exc.printStackTrace();
		}
		finally
		{
			// Step 5: CLOSE the scanner object	
			if (input != null)
			{
				input.close();
			}
		}


		return wordList;
			}

	public static void main(String[] args)
	{
		// Pipe-delimited words
		String line = "Hi |Bye |Yes |No";
		String [] words = line.split("[|]");

		System.out.println("The words after splitting: " + Arrays.toString(words));

		// Comma-separated words
		String line2 = "This,is,a,comma,separated,thing!     YAY!";
		String [] words2 = line2.split("[,]");
		System.out.println("The words2 after splitting: " + Arrays.toString(words2));


	}

}
