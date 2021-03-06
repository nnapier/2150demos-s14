
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Random;

/**Class: GradeDemo
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Mar 17, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class GradeDemo
{
	
	
	public static double findAverage(Collection<Integer> c)
	{
	
		double sum = 0;
		double average = 0;
		
		// Step 1: Use the iterator to find the sum
		Iterator<Integer> iterator = c.iterator();
		
		while ( iterator.hasNext())
		{
			int num = iterator.next();
			sum += num;
		}
		
		// Step 2: Compute the average
		if (c.size() > 0)
		{
			average = sum/c.size();
		}		
		
		return average;
	}
	
	
	/**
	 * This method generates random grades in the range of 0 to 100.
	 * It adds these grades to the collection passed in.
	 * @param c		Represents the collection we'll be adding to
	 * @param count Number of random grades to add
	 */
	public static void populateRandomGrades(Collection<Integer> c,
											int count)
	{
		Random generator = new Random();
		for (int i =0; i<count; i++)
		{
			// Repeatedly generate a random number
			// and add it to the collection
			int num = generator.nextInt(101); 
			c.add(num);
		}
	}

	// Remove the element in the middle of the list. 
	// To keep this simple, middle of list is always at position size()/2

	public static void removeMiddle(List<Integer> list)
	{
		
		if (!list.isEmpty())
		{
			int midPoint = list.size()/2;
			list.remove( midPoint );
		}
	}
	
	public static void displayFromEnd(List<Integer> list)
	{
		ListIterator<Integer> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> grade1 = new ArrayList<Integer>();
		populateRandomGrades(grade1, 4);
		System.out.println("grade1 average is: " + findAverage(grade1));
		
		LinkedList<Integer> grade2 = new LinkedList<Integer>();
		populateRandomGrades(grade2, 5);
		System.out.println("grade2 average is: " + findAverage(grade2));
		
		PriorityQueue<Integer> grade3 = new PriorityQueue<Integer>();
		populateRandomGrades(grade3, 6);
		System.out.println("grade3 average is: " + findAverage(grade3));

		ArrayList<Integer> allGrades = new ArrayList<Integer>();
		allGrades.addAll(grade1);
		allGrades.addAll(grade2);
		allGrades.addAll(grade3);
		
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		// removeMiddleUsingIterator( emptyList );
		
		System.out.println("allGrades average is: " + findAverage(allGrades));
		
		
	}

}
