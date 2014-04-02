/**Class: Sellable
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Mar 3, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public interface Sellable
{
	// There are NO Instance variables for Interfaces.
	
	// NOTE: Methods for interfaces are automatically public
	// and abstract. No need to put public abstract in front of
	// the return type.
	double getPrice();
	boolean inStock();
	boolean isEligibleForFreeShipping();
}
