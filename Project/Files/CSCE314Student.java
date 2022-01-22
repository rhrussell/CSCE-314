public class CSCE314Student extends Student
{
	private String firstName;
	private String lastName;
	private String UIN;
	private Enum Rank;
	private int JavaKnowledge;
	private int section;

	public CSCE314Student(String fName, String lName, String sUIN, Enum sRank, int javaKnow, int sec)
	{
		this.firstName = fName;
		this.lastName = lName;
		this.UIN = sUIN;
		this.Rank = sRank;
		this.JavaKnowledge = javaKnow;
		this.section = sec;
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

	public void setJavaKnowledge(int jk)
	{
		this.JavaKnowledge = jk;
	}
	
	public int getJavaKnowledge()
	{
		return this.JavaKnowledge;
	}
	
	public void setSection(int s)
	{
		this.section = s;
	}

	public int getSection()
	{
		return this.section;
	}
}