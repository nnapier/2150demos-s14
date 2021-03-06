import java.util.ArrayList;


/**Class: ClawCardList
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Jan 24, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class ClawCardList
{
	// Instance Variable(s)
	private ArrayList<ClawCard> cardList;
	
	// Constructor(s)
	public ClawCardList()
	{
		cardList = new ArrayList<ClawCard>();
	}
	
	/** This method allows you to add a ClawCard 
	 * object to the list
	 * @param card The card to be added
	 */
	public void addClawCard(ClawCard card)
	{
		cardList.add(card);
	}
	
	/**
	 * This method returns the number of items
	 * in your ClawCardList
	 * @return number of items in the list
	 */
	public int count()
	{
		return cardList.size();
	}
	
	/** 
	 * This method returns the number of faculty 
	 * cards that exist in the list
	 * @return number of faculty cards
	 */
	public int countFaculty()
	{
		int count = 0;
		
		// Using the enhanced for loop
		for ( ClawCard element : cardList )
		{
			if (element.getStatus() == ClawCard.StatusType.FACULTY)
			{
				count++;
			}
		}
		
		/*
		// First way: Uses the traditional for loop
		for (int i = 0; i < cardList.size(); i++)
		{
			ClawCard element = cardList.get(i);
			if (element.getStatus().equalsIgnoreCase("Faculty"))
			{
				count++;
			}
		}
		*/
		
		return count;
	}
	
	/** 
	 * This method will produce the average of the Claw Card Ids
	 * 
	 */
	public double average()
	{
		double average = 0;
		double sum = 0;
		
		// Get the sum of all the Ids
		for ( ClawCard element : cardList )
		{
			sum = sum + element.getId();
		}
		
		average = sum/cardList.size();
		
		return average;
	}
	
	/** This method will allow for a nice description
	 *  of the ClawCardList object. It will display
	 *  each element.
	 */
	@Override
	public String toString()
	{
		String value = "";
		
		for (int i=0; i < cardList.size(); i++)
		{
			// Get the element at this position
			ClawCard element = cardList.get(i);
			value += element + "\n";
		}
		
		return value;
	}
	
}





