public class Student extends Person
{
	private String firstName;
	private String lastName;
	private String UIN;
	private Enum Rank;
	//private Enum gender;

	public Student(String fName, String lName, String sUIN, Enum sRank)
	{
		this.firstName = fName;
		this.lastName = lName;
		this.UIN = sUIN;
		this.Rank = sRank;
	}

	public void setFirstName(String fname)
	{
		this.firstName = fname;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public void setLastName(String lname)
	{
		this.lastName = lname;
	}

	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setUIN(String suin)
	{
		this.UIN = suin;
	}

	public String getUIN()
	{
		return this.UIN;
	}

	public void setRank(Enum srank)
	{
		this.Rank = srank;
	}
	
	public Enum getRank()
	{
		return this.Rank;
	}

	/*public Enum getGender()
	{
		return this.gender;
	}*/
}