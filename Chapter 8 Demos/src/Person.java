import java.util.ArrayList;


public class Person
{
	// instance variables
	private String name;
	private String city;
	
	// Constructors
	public Person(String name, String city)
	{
		this.name = name;
		this.city = city;
	}
	
	// 1-arg constructor that passes in the name only
	// Default the city to "Lawrenceville"
	public Person(String name)
	{
		this(name, "Lawrenceville");
		
	}
	
	// No-Arg constructor
	public Person()
	{
		this("Nannette", "Atlanta");
		/* Instead of doing this
		name = "Nannette";
		city = "Atlanta";
		*/
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	// Create a static method that removes all the people from
	// a provided ArrayList that have city of Atlanta
	public static void removeAllAtlantaPeople(ArrayList<Person> personList)
	{
		/* HINT:  When you are looping through the ArrayList, 
		 * start at the end of the list first. If you Google for help, 
		 * there will be examples using iterators. We will use this approach 
		 * later in the semester. Do NOT use iterators now.
		 */
		
		for (int i = personList.size() - 1; i >= 0; i--)
		{
			Person person = personList.get(i);
			if (person.getCity().equalsIgnoreCase("Atlanta"))
			{
				personList.remove(i);
			}
		}
		
	}
	
	
	

}
