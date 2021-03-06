import java.util.ArrayList;

/**Class: PersonTester
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Feb 3, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class PersonTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Create several Person objects
		Person person1 = new Person("Sue", "Atlanta");
		Person person2 = new Person("Bob", "Atlanta");
		Person person3 = new Person("Joe", "Lawrenceville");
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		// Add all the people to the list
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		// Option 1: Printing the personList
		System.out.println(personList);
		
		// Option 2: Printing the personList
		for (Person element : personList)
		{
			System.out.println(element);
		}
		

	}

}
