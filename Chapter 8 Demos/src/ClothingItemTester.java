/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class ClothingItemTester 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 1) Create an object that represents a red blouse
		//    that is cotton and costs 34.50. Brand is Nike
		ClothingItem blouse = new ClothingItem();  
		blouse.setMaterial("cotton");
		blouse.setPrice(34.5);
		blouse.setColor("red");
		blouse.setBrand("Nike");
		
		//    SOP the object that you created
		System.out.println("The blouse is: " + blouse); // This calls the toString method
		
		// Compute a 20% discount on this object and SOP it
		System.out.println("A 20% discount is " + blouse.computeDiscount(.2));
		
		
		// 2) Create an object that represents green shoes that are
		//    leather and cost 89.34. Brand is Addias
		ClothingItem shoes = new ClothingItem("Addias", "XL", 89.34, 
											  "green", "leather");
		
		//	    SOP the object that you created
		System.out.println("The shoes are: " + shoes); // This calls the toString method

		// Compute a 20% discount on this object and SOP it
		System.out.println("A 20% discount is " + shoes.computeDiscount(.2));
	}

}
