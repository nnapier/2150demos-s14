import java.util.Iterator;
import java.util.Queue;

/**Class: QueueExample
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Mar 26, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class QueueExample
{

	/**
	 * This version of the code uses a for loop to traverse each element of the queue.
	 * After removing the element, it adds it back to the end of the queue.
	 * This results in the queue looking the same as it did when we entered the method
	 * @param q
	 * @param value
	 * @return
	 */
	public static boolean containsValueWithForLoop(Queue<String> q, String value)
	{
		boolean result = false;
		int qSize = q.size();

		for (int i=0; i< qSize; i++)
		{
			// Step 1: Get the element 
			String name = q.remove();

			// Step 2: Compare the element with the value passed in
			if (name.equals(value))
			{
				result = true;
			}
			
			// Step 3: Add the name to the end of the queue
			q.add(name);
		}

		return result;
	}

	/**
	 * This version of the method destroys the q after checking for the value
	 * @param q
	 * @param value
	 * @return
	 */
	public static boolean containsValueWithWhileLoop(Queue<String> q, String value)
	{
		boolean result = false;

		// Step 1: Use the while loop to traverse each element in the queue
		while ( !q.isEmpty())
		{
			// Step 2: Get the element 
			String name = q.remove();

			// Step 3: Compare the element with the value passed in
			if (name.equals(value))
			{
				result = true;
			}
		}

		return result;
	}


	/** 
	 * This version of the method does NOT destroy the queue after checking for the value
	 * because we are using the iterator
	 * @param q
	 * @param value
	 * @return
	 */
	public static boolean containsValueWithIterator(Queue<String> q, String value)
	{
		boolean result = false;

		// Step 1: Create the iterator. This puts the pointer 
		//         at the front of the queue
		Iterator<String> iter = q.iterator();

		// Step 2: Use the iterator to traverse (i.e., visit each element)
		//         the queue
		while (iter.hasNext())
		{
			// Step 3: Get the element
			String name = iter.next();

			// Step 4: Compare the element with the value passed in
			if (name.equals(value))
			{
				result = true;
			}
		}

		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
	}

}
