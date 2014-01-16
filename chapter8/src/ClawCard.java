import java.util.Date;

/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class ClawCard 
{
	private int id;			// Unique number for each individual
	private String name;	// Name of person who owns the card
	private String status; 	// Status, such as Faculty, staff, or student
	private boolean valid;	// Indicates whether the individual is still
							// affiliated with GGC (true if yes)
	private Date dateIssued; // Date card was first activated	

	
	private static int lastIdUsed = 9000;
	
	public ClawCard(String aName, String aStatus)
	{
		id = lastIdUsed++;
		name = aName;
		status = aStatus;
		valid = true;
		dateIssued = new Date();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "ClawCard [id=" + id + ", name=" + name + ", status=" + status
				+ ",\n\t valid=" + valid + ", dateIssued=" + dateIssued + "]";
	}
	
	
	
}
