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

	/**
	 * Changing the default behavior of the setColor method.
	 * The change will be: I'm adding an SOP statement
	 * and THEN I will call the super class version of setColor
	 */
	@Override
	public void setColor(String color)
	{
		System.out.println("--> In the Cat version of setColor");
		super.setColor(color);
	}
	
	/**
	 * @return the litterType
	 */
	public LitterType getLitterType()
	{
		return litterType;
	}

	/**
	 * @param litterType the litterType to set
	 */
	public void setLitterType(LitterType litterType)
	{
		this.litterType = litterType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return super.toString() + 
				"\nCat [litterType=" + litterType + "]";
	}
	
	public void makeKittyHappy()
	{
		// Change name to add "Happy " in front
		super.setName( "Happy " + super.getName());
		
		// Change weight to add 2.0 to the weight
		super.setWeight(2.0 + getWeight());
		
		// Change litter type to SCOOPABLE
		litterType = LitterType.SCOOPABLE;
	}

}
