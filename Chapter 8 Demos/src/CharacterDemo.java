/**Class: CharacterDemo
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Feb 5, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class CharacterDemo
{
	public static String checkSSNVersion2(String ssn)
	{
		String result = "Invalid SSN";
		
		// Valid SSNs have ALL of the following characteristics
		// 1) Length = 11
		// 2) Dashes appear at positions 3 and 6
		// 3) The other 9 characters are digits

		int countDash = 0;
		int countDigits = 0;
		for (int i=0; i < ssn.length(); i++)
		{
			char ch = ssn.charAt(i);
			if ( (i == 3 || i == 6) &&
					( ch == '-')
					)
			{
				countDash++;
			}
			else if ( Character.isDigit( ch ) )
			{
				countDigits++;
			}
		}
		
		if ( ssn.length() == 11 && 
			 countDash == 2 &&
			 countDigits == 9)
		{
			result = "Valid SSN";
		}

		return result;

	}
	
	public static String checkSSN(String ssn)
	{
		String result = "Invalid SSN";
		
		// Valid SSNs have ALL of the following characteristics
		// 1) Length = 11
		// 2) Dashes appear at positions 3 and 6
		// 3) All other characters are digits 
		if ( ssn.length() == 11 &&			 			 
			 Character.isDigit(ssn.charAt(0)) &&
			 Character.isDigit(ssn.charAt(1)) &&
			 Character.isDigit(ssn.charAt(2)) &&
			 ssn.charAt(3) == '-' &&
			 Character.isDigit(ssn.charAt(4)) &&
			 Character.isDigit(ssn.charAt(5)) &&
			 ssn.charAt(6) == '-' &&
			 Character.isDigit(ssn.charAt(7)) &&
			 Character.isDigit(ssn.charAt(8)) &&
			 Character.isDigit(ssn.charAt(9)) &&
			 Character.isDigit(ssn.charAt(10)) 
		   )
		{
			result = "Valid SSN";
		}		
		return result;
	}

	public static int countNumLetters(String str)
	{
		int count = 0;
		
		// Look at each character in the String
		// If the character is a Letter, increment count
		for (int i=0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			if ( Character.isLetter(letter))
			{
				count++;
			}
		}
		
		return count;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Checking 123456: " + CharacterDemo.checkSSN("123456"));
		System.out.println("Checking 123-45-6789: " + CharacterDemo.checkSSN("123-45-6789"));
		System.out.println("Checking 123-AB-6789: " + CharacterDemo.checkSSN("123-AB-6789"));
		
		System.out.println( "Expect 3: " + CharacterDemo.countNumLetters("1234 ABC"));
		System.out.println( "Expect 5: " + CharacterDemo.countNumLetters("Hello"));

	}

}
