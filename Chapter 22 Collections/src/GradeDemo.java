import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
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

	public static void main(String[] args)
	{
		ArrayList<Integer> grade1 = new ArrayList<Integer>();
		populateRandomGrades(grade1, 4);
		
		LinkedList<Integer> grade2 = new LinkedList<Integer>();
		populateRandomGrades(grade2, 5);
		
		PriorityQueue<Integer> grade3 = new PriorityQueue<Integer>();
		populateRandomGrades(grade3, 6);

	}

}
