import java.util.ArrayList;


public class Pet
{
	// Instance variables
	private String name;
	private String breed;
	private String color;
	private int numLegs;
	private double weight;
	
	// Constructors
	public Pet()
	{
		this("Pet", "mutt", "gray", 4, 4.5);
					
	}
	
	public Pet(String name, String breed, String color,
			   int numLegs, double weight)
	{
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.numLegs = numLegs;
		this.weight = weight;
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
	 * @return the numLegs
	 */
	public int getNumLegs()
	{
		return numLegs;
	}

	/**
	 * @return the weight
	 */
	public double getWeight()
	{
		return weight;
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
	 * @param numLegs the numLegs to set
	 */
	public void setNumLegs(int numLegs)
	{
		this.numLegs = numLegs;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Pet [name=" + name + ", breed=" + breed + ", color=" + color
				+ ", numLegs=" + numLegs + ", weight=" + weight + "]";
	}
	
	public static int totalLegs(ArrayList<Pet> petList)
	{
		int sum = 0;
				
		for (Pet element : petList)
		{
			sum = sum + element.getNumLegs();
		}
				
		return sum;
	}

	
	public static double totalWeight(ArrayList<Pet> petList)
	{
		double sum = 0;
		
		for (Pet element : petList)
		{
			sum = sum + element.getWeight();
		}
		
		return sum;
	}
	
	
	
}
