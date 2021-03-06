/**Class: Dryer
 * @author Allen Perry
 * @version 1.0
 * Course : ITEC 3150 Spring 2014
 * Written: Feb 18, 2014
 *
 *
 * This class � now describe what the class does
 *
 * Purpose: � Describe the purpose of this class
 */

public class Dryer extends Appliance
{
 //Instance Variable(s)
 private double capacity;
 private double recycleFee;

 //Constructor(s)
 /**
  * Constructor using modelNumber, description, color, capacity
  * @param modelNumber the modelNumber superclass
  * @param description the description superclass
  * @param color the color superclass
  * @param capacity the capactiy subclass
  */
 public Dryer(int modelNumber, String description, String color, double capacity)
 {
  super();
  setModelNumber(modelNumber);
  setDescription(description);
  setColor(color);
  this.capacity = capacity;
  setCost(400);
  recycleFee = 0;
 }

 /**
  * no argument constructor
  */
 public Dryer()
 {
  super();
  capacity = 1000;
  recycleFee = 22.5;
  setCost(500);
 }

 /**
  * @return the capacity
  */
 public double getCapacity()
 {
  return capacity;
 }

 /**
  * @param capacity the capacity to set
  */
 public void setCapacity(double capacity)
 {
  this.capacity = capacity;
 }

 /**
  * @return the recycleFee
  */
 public double getRecycleFee()
 {
  return recycleFee;
 }

 /**
  * @param recycleFee the recycleFee to set
  */
 public void setRecycleFee(double recycleFee)
 {
  this.recycleFee = recycleFee;
 }

 /**
  * Different from superclass
  * Calculates the cost for a dryer to be the cost plus warranty and recycle fees
  * @return the total cost for a dryer
  */
 @Override
 public double getCost()
 {
  System.out.println("Calling Dryer.getCost method");
  double total = getRecycleFee() + calculateWarrantyFee() + super.getCost();
  return total;
 }

 @Override
 public String toString()
 {
  String value = "";
  value += super.toString();
  value += "\n The capacity is: " + capacity;
  value += "\n The recycle fee is: " + recycleFee;
  return value;
 }

 
 
 /* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode()
{
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(capacity);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(recycleFee);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dryer other = (Dryer) obj;
	if (Double.doubleToLongBits(capacity) != Double
			.doubleToLongBits(other.capacity))
		return false;
	if (Double.doubleToLongBits(recycleFee) != Double
			.doubleToLongBits(other.recycleFee))
		return false;
	return true;
}

/**
  * Calculates the warranty fee based on the appliance being a dryer
  * @return the total warranty fee
  */
 @Override
 public double calculateWarrantyFee()
 {
  double total = 10 + (.0525 * super.getCost());
  return total;
 }

 /**
  * Decreases the life left variable every time it is ran based on a dryer
  * @param power the enum power level that is used
  */
 @Override
 public void start(PowerLevel power)
 {
  if(power == PowerLevel.LOW)
  {
   setLifeLeft(getLifeLeft() - 10);
  }
  else if(power == PowerLevel.MEDIUM)
  {
   setLifeLeft(getLifeLeft() - 20);
  }
  else if(power == PowerLevel.HIGH)
  {
   setLifeLeft(getLifeLeft() - 25);
  }

 }
 
 /** Example of overloading the start method
  *  This is overloaded because there is another
  *  method that has the same name but different parameters
  */
 public void start()
 {
	start(PowerLevel.MEDIUM); 
 }
 
 

}
