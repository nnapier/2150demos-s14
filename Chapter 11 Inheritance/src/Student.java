/**Class: Student
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2150 Spring 2014
 * Written: Feb 26, 2014
 *
 * This class - TODO
 *
 * Purpose: - TODO
 */

public abstract class Student
{
	// Instance variables
	private String name;
	private int studentId;
	private String mentor;
	private int numCredits;
	
	// Abstract methods
	public abstract double calculateTuition();
	public abstract boolean dropClass(int numCredits);
	
	// Constructors
	public Student()
	{
		this("Nannette", 9000, "Bob", 12);		
	}
	
	public Student(String name, int id, String mentor,
			       int numCredits)
	{
		this.name = name;
		this.studentId = id;
		this.mentor = mentor;
		this.numCredits = numCredits;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId()
	{
		return studentId;
	}
	/**
	 * @return the mentor
	 */
	public String getMentor()
	{
		return mentor;
	}
	/**
	 * @return the numCredits
	 */
	public int getNumCredits()
	{
		return numCredits;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	/**
	 * @param mentor the mentor to set
	 */
	public void setMentor(String mentor)
	{
		this.mentor = mentor;
	}
	/**
	 * @param numCredits the numCredits to set
	 */
	public void setNumCredits(int numCredits)
	{
		this.numCredits = numCredits;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", studentId=" + studentId
				+ ", mentor=" + mentor + ", numCredits=" + numCredits + "]";
	}
	
	
}
