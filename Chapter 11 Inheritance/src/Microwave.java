/**Class: Microwave
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

public class Microwave extends Appliance
{
 //Instance Variables
 private boolean isOverTheRange;
 private int numVentSpeeds;

 //Constructors
 /**
  * Constructor usig modelNumber, description, color, isOverTheRange, numVentSpeeds
  * @param modelNumber the model number superclass
  * @param description the description superclass
  * @param color the color superclass
  * @param isOverTheRange is over the range subclass
  * @param numVentSpeeds number of vent speeds subclass
  */
 public Microwave(int modelNumber, String description, String color, boolean isOverTheRange, int numVentSpeeds)
 {
  super();
  setModelNumber(modelNumber);
  setDescription(description);
  setColor(color);
  this.isOverTheRange = isOverTheRange;
  this.numVentSpeeds = numVentSpeeds;
 }

 /**
  * no argument constructor
  */
 public Microwave()
 {
  super();
  isOverTheRange = true;
  numVentSpeeds = 2;
 }

 /**
  * @return the isOverTheRange
  */
 public boolean isOverTheRange()
 {
  return isOverTheRange;
 }

 /**
  * @param isOverTheRange the isOverTheRange to set
  */
 public void setOverTheRange(boolean isOverTheRange)
 {
  this.isOverTheRange = isOverTheRange;
 }

 /**
  * @return the numVentSpeeds
  */
 public int getNumVentSpeeds()
 {
  return numVentSpeeds;
 }

 /**
  * @param numVentSpeeds the numVentSpeeds to set
  */
 public void setNumVentSpeeds(int numVentSpeeds)
 {
  this.numVentSpeeds = numVentSpeeds;
 }

 @Override 
 public String toString()
 {
  String value = "";
  value += super.toString();
  value += "\n It is over the range: " + isOverTheRange;
  value += "\n The number of vent speeds: " + numVentSpeeds;
  return value;
 }
 /**
  * Decreases the life left variable every time it is ran based on it being a microwave
  * @param power the enum power level that is used
  */
 @Override
 public void start(PowerLevel power)
 {
  if(power == PowerLevel.LOW)
  {
   setLifeLeft(getLifeLeft() - 4);
  }
  if(power == PowerLevel.MEDIUM)
  {
   setLifeLeft(getLifeLeft() - 6);
  }
  if(power == PowerLevel.HIGH)
  {
   setLifeLeft(getLifeLeft() - 8);
  }
 }

}
