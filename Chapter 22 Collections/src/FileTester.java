import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**Class: FileTester
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Apr 7, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class FileTester
{
	/**
	 * This method will read each line of the file and SOP it
	 * @param fileName
	 */
	public static void displayFile(String fileName)
	{
		try
		{
			// Step 1: Create the File object
			File file = new File(fileName);
			
			// Step 2: Create the Scanner object, passing in the File object
			Scanner input = new Scanner(file);
			
			// Step 3: Use the Scanner methods to read data from file
			while ( input.hasNextLine() )
			{
				String line = input.nextLine();
				System.out.println("Line is: " + line);
			}
			
			// Step 4: Close the file
			input.close();
		}
		catch(NullPointerException exc)
		{
			System.err.println("null passed in for fileName");
		}
		catch(FileNotFoundException exc)
		{
			System.err.println("File Not Found: " + fileName);
		}
	}
	
	/**
	 * This method will read the file word by word and count the
	 * of words in the file
	 * @param fileName Name of the file to read
	 * @throws FileNotFoundException
	 */
	public static int countNumWords(String fileName) 
						throws FileNotFoundException
	{
		int count = 0;
		
		// Step 1: Create the File object
		//File file = new File(fileName);
		
		// Step 2: Create the Scanner object
		//Scanner input = new Scanner( file );
		Scanner input = new Scanner ( new File(fileName));
		
		// Step 3: Use the Scanner methods to read the file
		while ( input.hasNext())
		{
			String word = input.next();
			System.out.println("Word is: " + word);
			count++;
		}
		
		// Step 4: Close the Scanner reference to the file
		input.close();
		
		return count;
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("sample.txt");
		System.out.println("Absolute path is: " + file.getAbsolutePath());
		System.out.println("Name is: " + file.getName());
		System.out.println("Does it exist? " + file.exists());
		System.out.println("What is the length? " + file.length());
		
		// Read the file line-by-line
		// Step 1: Create file object (done above)
		// Step 2: Create Scanner, pass in file object
		Scanner input = new Scanner(file);
		
		// Step 3: Use the Scanner methods to read data from file
		while ( input.hasNextLine() )
		{
			String line = input.nextLine();
			System.out.println("Line is: " + line);
		}

		// Step 4: Close the file
		input.close();
		
		// Examples of calling the displayFile method
		displayFile("sample.txt");
		displayFile("doesNotExist.txt");
		displayFile(null);
		displayFile("");
		
		System.out.println("-----Calling countNumWords-------");
		System.out.println(countNumWords("sample.txt"));
	}

}
