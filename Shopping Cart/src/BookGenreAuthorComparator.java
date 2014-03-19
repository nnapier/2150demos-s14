import java.util.Comparator;

/**Class: BookGenreAuthorComparator
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Mar 19, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public class BookGenreAuthorComparator implements Comparator<Book>
{

	@Override
	public int compare(Book arg0, Book arg1)
	{
		int result = 0;
		// Sort based upon genre. 
		// If genre is the same, sort by author
		if(arg0.getGenre().equals(arg1.getGenre()))
		{
			result = arg0.getAuthor().compareTo(arg1.getAuthor());
		}
		else
		{
			result = arg0.getGenre().compareTo(arg1.getGenre());
		}
		return result;
	}

}
