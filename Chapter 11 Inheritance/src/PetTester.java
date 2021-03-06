import java.util.ArrayList;

/**Class: PetTester
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Feb 19, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class PetTester
{	
	public static void main(String[] args)
	{
		// Create the petHouse
		ArrayList<Pet> petHouse = new ArrayList<Pet>();
		
		// Create a Cat using no-argument constructor
		Cat cat1 = new Cat();
		System.out.println("Before changes: " + cat1);

		// Let's change the name of the cat to "Kitty"
		// and the color to "red" and
		// change litter to CLUMP_FREE
		cat1.setName("Kitty");
		cat1.setColor("red");
		cat1.setLitterType(Cat.LitterType.CLUMP_FREE);
		System.out.println("After changes: " + cat1);
		
		// Create a second Cat
		Cat cat2 = new Cat ("Garfield", "Some breed", "black", 41.0, Cat.LitterType.CLUMP_FREE);
		cat2.makeKittyHappy();
		
		// Add both cats to our petHouse
		petHouse.add(cat1);
		petHouse.add(cat2);
		
		System.out.println("----------------------");
		System.out.println("For loop results");
		// Use the enhanced for loop to SOP all elements in the petHouse
		for ( Pet element   : petHouse   )
		{
			System.out.println( element );
		}
		
		
	}

}
