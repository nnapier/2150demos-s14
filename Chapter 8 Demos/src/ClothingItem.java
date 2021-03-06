/**
 * Class: ClothingItem
 * 
 * @author Nannette Napier
 * @version 1.0 Course: ITEC 2150 Spring 2014 Written: January 10, 2014
 * 
 * 
 *          This class represents an item of clothing that can be sold in our
 *          store
 * 
 *          Purpose: Represent an item of clothing
 */
public class ClothingItem
{
	// Instance Variables
	private String brand; // Brands such as Nike, Addias
	private String size; // Sizes such as S, M, L, XL
	private double price; // Price of the clothing item
	private String color; // Color of the item (such as Red, blue)
	private String material; // Material of the item (such as cotton)

	// Constructor(s)
	public ClothingItem() // No argument constructor
	{
		// Initialize all the instance variables
		brand = "Unknown";
		size = "M";
		price = 10.34;
		color = "Red";
		material = "cotton";
	}

	// 1) Create a constructor that has only 1 parameter: aBrand.
	// Set the other instance variables to reasonable default values

	public ClothingItem(String aBrand)
	{
		brand = aBrand;
		size = "M";
		price = 10.34;
		color = "Red";
		material = "cotton";
	}

	// 2) Create a constructor that has 5 parameter variables --
	// one for each of the instance variables
	public ClothingItem(String aBrand, String aSize, double aPrice,
			String aColor, String aMaterial)
	{
		brand = aBrand;
		size = aSize;
		price = aPrice;
		color = aColor;
		material = aMaterial;
	}

	// Getters and Setters
	/**
	 * @return the brand
	 */
	public String getBrand()
	{
		return brand;
	}

	/**
	 * @return the size
	 */
	public String getSize()
	{
		return size;
	}

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * @return the material
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size)
	{
		this.size = size;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * @param material
	 *            the material to set
	 */
	public void setMaterial(String material)
	{
		this.material = material;
	}

	// Instance methods
	public String toString()
	{
		String value = "Brand is " + brand + "\n";
		value += "\tSize is " + size + "\n";
		value += "\tPrice is " + price + "\n";
		value += "\tColor is " + color + "\n";
		value += " \tMaterial is " + material + "\n";
		return value;
	}

	// Create an instance method called computeDiscount.
	// It takes as a parameter the percentage of the discount
	// It returns the discounted price. It does not
	// modify any of the instance variables.
	public double computeDiscount(double percentage)
	{
		// 1 - compute the discounted amount
		double discount = price * percentage;

		// 2 - Subtract the discount from the original price
		// return this value
		return price - discount;
	}

}
