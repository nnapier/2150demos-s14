/**Class: Appliance
 * @author Allen Perry
 * @version 1.0
 * Course : ITEC 3150 Spring 2014
 * Written: Feb 18, 2014
 *
 *
 * This class – now describe what the class does
 *
 * Purpose: – Describe the purpose of this class
 */

public class Appliance
{
 public enum PowerLevel 
 {
  LOW, MEDIUM, HIGH
 }

 //Instance Variable(s)
 private int modelNumber;
 private String description;
 private String color;
 private double cost;
 private int lifeLeft;

 //Constructor(s)
 /**
  * no-arg constructor
  */
 public Appliance()
 {
  modelNumber = 12345;
  description = "Brand new";
  color = "white";
  cost = 99.99;
  lifeLeft = 3;
 }

 /**
  * @return the modelNumber
  */
 public int getModelNumber()
 {
  return modelNumber;
 }

 /**
  * @param modelNumber the modelNumber to set
  */
 public void setModelNumber(int modelNumber)
 {
  this.modelNumber = modelNumber;
 }

 /**
  * @return the description
  */
 public String getDescription()
 {
  return description;
 }

 /**
  * @param description the description to set
  */
 public void setDescription(String description)
 {
  this.description = description;
 }

 /**
  * @return the color
  */
 public String getColor()
 {
  return color;
 }

 /**
  * @param color the color to set
  */
 public void setColor(String color)
 {
  this.color = color;
 }

 /**
  * @return the cost
  */
 public double getCost()
 {
  return cost;
 }

 /**
  * @param cost the cost to set
  */
 public void setCost(double cost)
 {
  this.cost = cost;
 }

 /**
  * @return the lifeLeft
  */
 public int getLifeLeft()
 {
  return lifeLeft;
 }

 /**
  * @param lifeLeft the lifeLeft to set
  */
 public void setLifeLeft(int lifeLeft)
 {
  this.lifeLeft = lifeLeft;
 }

 @Override
 public String toString()
 {
  String value = "";
  value += "Model number is: " + modelNumber;
  value += "\n Description: " + description;
  value += "\n The color is: " + color;
  value += "\n The cost is: " + cost;
  value += "\n The life left is: " + lifeLeft;
  return value;
 }

 
 
 
 /* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode()
{
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	long temp;
	temp = Double.doubleToLongBits(cost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result
			+ ((description == null) ? 0 : description.hashCode());
	result = prime * result + lifeLeft;
	result = prime * result + modelNumber;
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Appliance other = (Appliance) obj;
	if (color == null)
	{
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
		return false;
	if (description == null)
	{
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (lifeLeft != other.lifeLeft)
		return false;
	if (modelNumber != other.modelNumber)
		return false;
	return true;
}

/**
  * Calculate the warranty fee for all appliances
  * @return 10  the warranty fee for 
  */
 public double calculateWarrantyFee()
 {
  return 10.0;
 }

 /**
  * Decreases the life left variable every time it is ran
  * @param power the enum power level that is used
  */
 public void start(PowerLevel power)
 {
  lifeLeft -= 50;
 }
}
