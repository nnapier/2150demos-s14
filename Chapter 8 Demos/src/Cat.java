/**Class: Cat
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Jan 13, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

/**
 * @author nnapier
 *
 */
public class Cat
{
	private String name;
	private String breed;
	private String color;
	private double weight;
	private boolean isVaccinated;
	
	// Constructors
	/** Method: Cat
	 *  No-argument constructor for the Cat class
	 */
	public Cat()
	{
		name = "Garfield";
		breed = "mutt";
		color = "orange";
		weight = 4.5;
		isVaccinated = true;
	}
	
	/** Method: Cat
	 * Constructor that allows you to name the cat
	 * @param aName the name of the new cat
	 */
	public Cat(String aName)
	{
		name = aName;
		breed = "mutt";
		color = "orange";
		weight = 4.5;
		isVaccinated = true;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed()
	{
		return breed;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight()
	{
		return weight;
	}

	/**
	 * @return the isVaccinated
	 */
	public boolean isVaccinated()
	{
		return isVaccinated;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	/**
	 * @param isVaccinated the isVaccinated to set
	 */
	public void setVaccinated(boolean isVaccinated)
	{
		this.isVaccinated = isVaccinated;
	}
	
	

}
