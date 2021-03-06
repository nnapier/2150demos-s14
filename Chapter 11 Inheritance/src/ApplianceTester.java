import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class ApplianceTester
{

 /** Do NOT Modify
  * This method runs tests on select methods of the Dryer class
  * @return true if the Dryer methods tested worked
  */
 public static boolean testDryerMethods()
 {
  int numErrors = testNoArgDryer();

  Dryer dryer2 = new Dryer(123, "Great Dryer", "Black", 500);
  if (dryer2.getModelNumber() != 123 ||
    dryer2.getCapacity() != 500 ||
    dryer2.getRecycleFee() != 0 
    )
  {
   System.err.println("4-arg Dryer: Problem with constructor");
   numErrors++;
  }
  dryer2.setCost(400);

  if ( dryer2.calculateWarrantyFee() != 31.00)
  {
   System.err.println("4-arg Dryer: Problem with calculateWarrantyFee");
   numErrors++;
  }

  if (dryer2.getCost() != 431.0)
  {
   System.err.println("4-arg Dryer: Problem with getCost calculation");
   numErrors++;
  }

  return numErrors == 0;
 }

 /** Do NOT Modify
  * This method runs tests on select methods of the Dryer class
  * @return the number of methods that did not work
  */
 private static int testNoArgDryer()
 {
  int numErrors = 0;
  // Test the getCost and calculateWarrantyFee methods
  Dryer dryer = new Dryer();
  if (dryer.getCapacity() != 1000 ||
    dryer.getRecycleFee() != 22.50 
    )
  {
   System.err.println("Dryer: Problem with no-arg constructor");
   numErrors++;
  }
  dryer.setRecycleFee(20);

  if (dryer.calculateWarrantyFee() != 36.25 )
  {
   System.err.println("No-arg Dryer: Problem with calculateWarrantyFee");
   numErrors++;
  }

  if (dryer.getCost() != 556.25 )
  {
   System.err.println("No-arg Dryer: Problem with getCost calculation");
   numErrors++;
  }

  // Testing start method
  dryer.setLifeLeft(100);
  dryer.start(Appliance.PowerLevel.LOW);
  dryer.start(Appliance.PowerLevel.LOW);
  dryer.start(Appliance.PowerLevel.MEDIUM);
  dryer.start(Appliance.PowerLevel.HIGH);
  if (dryer.getLifeLeft() != 35)
  {
   System.err.println("No-arg Dryer: Problem with start method");
   numErrors++;
  }

  return numErrors;

 }



 /** Do NOT Modify
  * This method runs tests on select methods of the Microwave class
  * @return true if the Microwave methods tested worked
  */
 public static boolean testMicrowaveMethods()
 {
  int numErrors = 0;
  
  // Test the getCost and calculateWarrantyFee methods
  Microwave microwave = new Microwave();
  if (!microwave.isOverTheRange() ||
    microwave.getNumVentSpeeds() != 2 
    )
  {
   System.err.println("Microwave: Problem with no-arg constructor");
   numErrors++;
  }

  microwave.setCost(100);
  if (microwave.calculateWarrantyFee() != 10 )
  {
   System.err.println("No-arg Microwave: Problem with calculateWarrantyFee");
   numErrors++;
  }
  
  // Testing start method
  microwave.setLifeLeft(100);
  microwave.start(Appliance.PowerLevel.LOW);
  microwave.start(Appliance.PowerLevel.LOW);
  microwave.start(Appliance.PowerLevel.MEDIUM);
  microwave.start(Appliance.PowerLevel.HIGH);
  if (microwave.getLifeLeft() != 78)
  {
   System.err.println("No-arg Microwave: Problem with start method");
   numErrors++;
  }

  return numErrors == 0;

 }
 
 public static void useScanner()
 {
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("Enter an integer:");
	 int num1 = keyboard.nextInt();
	 // Consume the new Line character
	 keyboard.nextLine();
	 
	 System.out.println("Enter a String:");
	 String name = keyboard.nextLine();
 }
 
 public static void exampleDynamicBinding()
 {
	 Appliance dryer1 = new Dryer();
	 Appliance dryer2 = new Dryer();
	 
	 System.out.println("Dryer 1 model number is: " + dryer1.getModelNumber());
	 System.out.println("Dryer 1 description is: " + dryer1.getDescription());
	 
	 // Get a Dryer reference
	 Dryer aDryer1Ref = (Dryer)dryer1;
	 System.out.println("Dryer 1 recyling fee is: " + aDryer1Ref.getRecycleFee());
	 
	 System.out.println("Dryer 1 capacity is: " + ((Dryer)dryer1).getCapacity());
	 
	 Dryer dryer3 = new Dryer();
	 dryer3.setCapacity(500000);
	 
	 System.out.println("Is dryer1 equal to dryer2? Expect true: " + dryer1.equals(dryer2));
	 System.out.println("Is dryer1 equal to dryer3? Expect false: " + dryer1.equals(dryer3));
 
 }
 
 public static void main(String[] args)
 {
	 // useScanner();
	 // exampleDynamicBinding();
	 
	 // Step 1: Generate a random number between 1 and 10
	 Random generator = new Random();
	 // Create a random int between 0 and 10
	 int num1 = generator.nextInt(11);
	 int num2 =  generator.nextInt(11);
	 
	 // Create an ArrayList of Appliance
	 ArrayList<Appliance> applianceList = new ArrayList<Appliance>();
	 
	 // Create num1 number of Dryers. Add these to the Appliance List
	 for (int i=0; i < num1; i++)
	 {
		 Dryer dryer = new Dryer();
		 applianceList.add(dryer);
		 // DO the same thing for Microwaves -- except use num2
	 }
	 
	 // Create num2 number of Microwaves. Add these to the Appliance List
	 for (int i=0; i < num2; i++)
	 {
		 Microwave microwave = new Microwave();
		 applianceList.add(microwave);
		 // DO the same thing for Microwaves -- except use num2
	 }

	 // SOP the applianceList using the enhanced for loop
	 int countDryers = 0;
	 int countMicrowaves = 0;
	 double totalCapacity = 0;
	 for (Appliance element : applianceList)
	 {
		 if ( element instanceof Dryer)
		 {
			 totalCapacity += ((Dryer) element).getCapacity();
			 countDryers++;
		 }
		 else if ( element instanceof Microwave)
		 {
			 countMicrowaves++;
		 }
		 System.out.println(element);
	 }
	 
	 System.out.println("Count of dryers: " + countDryers);
	 System.out.println("Count of microwaves: " + countMicrowaves);
	 System.out.println("Average capacity: " + totalCapacity/countDryers);
/*

  if ( testDryerMethods() )
  {
   System.out.println("Dryer: All methods passed tests.");
  }

  if ( testMicrowaveMethods() )
  {
   System.out.println("Microwave: All methods passed tests.");
  }

  Dryer dry = new Dryer();
  Dryer dry2 = new Dryer(456, "Refurbished", "Silver", 700);
  Microwave heat = new Microwave();
  Microwave heat2 = new Microwave(963, "Pre-Owned", "Black", false, 3);
  ArrayList<Appliance> list = new ArrayList<Appliance>();
  list.add(dry);
  list.add(dry2);
  list.add(heat);
  list.add(heat2);
  for(Appliance kitchen: list)
  {
   System.out.println(kitchen);
  }
  */
 }



}
