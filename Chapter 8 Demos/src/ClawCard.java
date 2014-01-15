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
	// Instance variables -- belong to a specific object
	private int id;
	private String name;
	private String status;
	private boolean valid;
	private Date dateIssued;
	
	// Static variables -- shared by all objects of the ClawCard class
	private static int lastIdUsed = 9000;
	
	// Constructor
	
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
	public String getStatus()
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
	public void setStatus(String status)
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
	
	

}
