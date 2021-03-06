/**Class: ClawCard
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Jan 15, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */
import java.util.Date;

public class ClawCard
{
	// Step 1 in using enum: Declare the enum
	public enum StatusType
	{
		FACULTY,
		STUDENT,
		STAFF,
		OTHER
	}
		
	// Instance variables -- belong to a specific object
	private int id;
	private String name;
	
	// Step 2 in using enum: Declare a variable that uses this type
	private StatusType status; // Faculty, Student, Staff, Other
	private boolean valid;
	private Date dateIssued;
	
	
	// Static variables -- shared by all objects of the ClawCard class
	private static int lastIdUsed = 9000;
	
	// Constructor
	/**
	 * No-argument constructor
	 */
	public ClawCard()
	{
		// Step 3 in using enum: To use the values, put the type in front of the constant
		this("John Doe", StatusType.STUDENT);		
	}
	
	/**
	 * 1 argument constructor
	 * @param aName
	 */
	public ClawCard(String name)
	{
		this( name, StatusType.STUDENT);
	}
	
	public ClawCard(String name, StatusType status)
	{
		id = lastIdUsed + 1;
		this.name = name;
		this.status = status;
		valid = true;
		
		// Set the dateIssued to the current date		
		dateIssued = new Date();
		
		lastIdUsed++; // lastIdUsed = lastIdUsed + 1;
	}
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the status
	 */
	public StatusType getStatus()
	{
		return status;
	}
	/**
	 * @return the valid
	 */
	public boolean isValid()
	{
		return valid;
	}
	/**
	 * @return the dateIssued
	 */
	public Date getDateIssued()
	{
		return dateIssued;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusType status)
	{
		this.status = status;
	}
	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid)
	{
		this.valid = valid;
	}
	/**
	 * @param dateIssued the dateIssued to set
	 */
	public void setDateIssued(Date dateIssued)
	{
		this.dateIssued = dateIssued;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "ClawCard [id=" + id + ", name=" + name + ", status=" + status
				+ ", valid=" + valid + ", dateIssued=" + dateIssued + "]";
	}
	
	/**
	 * Return the next available ClawCard id
	 * @return next available ClawCard id
	 */
	public static int getNextId()
	{
		return lastIdUsed + 1;
	}
	/**
	 * Return the smallest ID of the two passed in
	 * @param id1
	 * @param id2
	 * @return
	 */
	public static int min(int id1, int id2)
	{
		int minValue = 0;
		String description = "Hi there";
		if (id1 < id2)
		{
			String second = "Another one";
			minValue = id1;
			System.out.println(second);
		}
		else
		{
			minValue = id2;
		}
		
		System.out.println(description);		
		return minValue;
	}
	
	/**
	 * 
	 * @param inputId
	 * @return
	 */
	public static boolean isValidId(int inputId)
	{
		boolean result = false;
		
		// if inputId is between 9000 and 9999 inclusive
		if (inputId >= 9000 && inputId <= 9999)
		{
			result = true;
		}
		
		return result;
	}

}
