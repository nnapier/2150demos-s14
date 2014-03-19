import java.util.ArrayList;
import java.util.Collections;

/**Class: ShoppingCartTester
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Mar 3, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class ShoppingCartTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Sellable> cart = new ArrayList<Sellable>();
		
		// Assume that we have added some items to the cart here
		Book book1 = new Book();
		book1.setPrice(10);
		Book book2 = new Book("A Title", "An Author");
		book2.setPrice(20);
		Book book3 = new Book("B Title", "B Author");
		book3.setPrice(30);
		Book book4 = new Book("C Title", "C Author");
		book4.setPrice(40);
		Book book5 = new Book("Same Title", "C Author");
		book5.setPrice(15);
		cart.add(book1);
		cart.add(book2);
		cart.add(book3);
		cart.add(book4);
		cart.add(book5);
		
		System.out.println("Cart before sorting: " + cart);
		
		// Do some computations
		// 1) Compute the total price of all elements in the ArrayList
		double totalPrice = 0;
		for ( Sellable element : cart)
		{
			totalPrice = totalPrice + element.getPrice();
		}
		System.out.println("Total Price of items in cart is: " + totalPrice);
		
		// 2) Compute number of elements that are eligible for free shipping
		int countEligible = 0;
		for (Sellable element : cart)
		{
			if ( element.isEligibleForFreeShipping())
			{
				countEligible++;
			}
		}
		System.out.println("Total number of items eligible for free shipping: " 
		                   + countEligible);

		// 3) Sort the items in the cart by author's name
		ArrayList<Book>  bookList = new ArrayList<Book>();
		for ( Sellable element : cart)
		{
			bookList.add((Book)element);
		}
		
		Collections.sort(bookList);
		System.out.println("Cart AFTER sorting by author name and price: " + bookList);
		
		Collections.sort(bookList, new BookGenreAuthorComparator());
		System.out.println("Cart AFTER using BookGenreAuthorComparator: \n" + bookList);
	}

}
