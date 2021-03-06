import java.util.Date;
import java.util.Scanner;

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
	 * Use a Scanner object to ask the user for their name
	 * and their status. This information will be used to
	 * construct a ClawCard object which will be returned.
	 * @return ClawCard object
	 */
	public static ClawCard createClawCardFromUser()
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Ask the user their name
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		
		// Ask the user their status
		System.out.println("What is your status?");
		String status = keyboard.nextLine();
		
		// Convert from String status --> enum
		ClawCard.StatusType statusType;
		if (status.equalsIgnoreCase("Faculty"))
		{
			statusType = ClawCard.StatusType.FACULTY;
		}
		else if (status.equalsIgnoreCase("Student"))
		{
			statusType = ClawCard.StatusType.STUDENT;
		}
		else if ( status.equalsIgnoreCase("Staff"))
		{
			statusType = ClawCard.StatusType.STAFF;	
		}
		else
		{
			statusType = ClawCard.StatusType.OTHER;
		}
			
		
		// Construct the ClawCard object using the information
		// typed in by the user
		ClawCard card = new ClawCard(name, statusType);
		
		// Return the ClawCard object
		return card;
	}

	public static void main(String[] args)
	{
		
		// 1) Create a ClawCardList
		ClawCardList myList = new ClawCardList();
		
		// 2) Create 3 ClawCard objects
		ClawCard card1 = new ClawCard();
		ClawCard card2 = new ClawCard();
		ClawCard card3 = new ClawCard();
		
		// 3) Add each ClawCard object to the ClawCardList
		myList.addClawCard(card1);
		myList.addClawCard(card2);
		myList.addClawCard(card3);
		
		// 4) SOP the ClawCardList
		System.out.println(myList);
		/*
		// 0) Ask the user information to construct a ClawCard
		//    (Call the createClawCardFromUser method)
		System.out.println(ClawCardTester.createClawCardFromUser());
		System.out.println(createClawCardFromUser());  // This is OK, too
		
		// Creating 5 users
		ClawCard user1 = createClawCardFromUser();
		System.out.println("Id for user1 is: " + user1.getId());
		System.out.println("Status for user1 is: " + user1.getStatus());
		
		ClawCard user2 = createClawCardFromUser();
		ClawCard user3 = createClawCardFromUser();
		ClawCard user4 = createClawCardFromUser();
		ClawCard user5 = createClawCardFromUser();
		
		// 1) Creating objects
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
		
		// 2) Testing static methods
		System.out.println(" The min Id is: " +  ClawCard.min(9494, 3834834) );
		
		System.out.println("Is 99 valid id? (Expect false) " + ClawCard.isValidId(99));
		System.out.println("Is 9000 valid id? (Expect true)" + ClawCard.isValidId(9000));
		System.out.println("Is 9999 valid id? (Expect true)" + ClawCard.isValidId(9999));
		*/
	}

}
