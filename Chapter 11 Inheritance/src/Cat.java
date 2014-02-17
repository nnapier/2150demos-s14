/**Class: Cat
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Feb 17, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class Cat extends Pet
{
	// Instance variable
	public enum LitterType { SCOOPABLE, REGULAR, CLUMP_FREE } 
	
	private LitterType litterType;
	
	// no-arg Constructor
	public Cat()
	{
		super();	// Calling the Pet no-arg constructor
		litterType = LitterType.REGULAR; // Initializing the Cat-only instance variable
	}
	
	public Cat(String name, String breed, String color, double weight)
	{
		super(name, breed, color, 4, weight); // Calling the Pet 5-arg constructor
		litterType = LitterType.REGULAR; // Initializing the Cat-only instance variable
	}
	
	public Cat(String name, String breed, String color, double weight, 
			LitterType litterType)
	{
		super(name, breed, color, 4, weight); // Calling the Pet 5-arg constructor
		this.litterType = litterType;
	}
	

}
