import java.util.Date;

/**Class: ClawCardTester
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Jan 15, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class ClawCardTester
{

	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ClawCard card1 = new ClawCard();
		System.out.println(card1);
		
		ClawCard card2 = new ClawCard();
		card2.setId(1);
		card2.setName("John Doe");
		card2.setStatus("Student");
		card2.setValid(true);
		
		Date dateIssued = new Date(); // current date and time
		card2.setDateIssued(dateIssued);
		System.out.println(card2);

		// Example calling a static method
		System.out.println("The next available ClawCard id is: " + 
							ClawCard.getNextId() );
		
		ClawCard card3 = new ClawCard("Nannette");
		System.out.println( card3);
		
		System.out.println(" The min Id is: " +  ClawCard.min(9494, 3834834) );
		
	}

}
