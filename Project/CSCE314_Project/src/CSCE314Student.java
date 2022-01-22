/*
 * Class Description: Child class to Student that has 2 constructors (default, parameterized), 
 * 					  setters/getters for its two int variable JavaKnowledge and section 
 * 					  and an overriden toString() method. Can also use/has Person's and 
 * 					  Student's methods/variables. This class is used to create the objects
 * 					  the other remaining classes use to creates the teams of these two
 * 					  CSCE314 Students
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

public class CSCE314Student extends Student	//child of the Student class
{
	private int JavaKnowledge;	//CSCE 314 Student's JavaKnowledge
	private int section;	//CSCE 314 Student's section

	public CSCE314Student()	//default constructor for CSCE314Student with no parameters
	{
		super();	//calls the default super (Student) constructor
		this.JavaKnowledge = 0;	//sets the CSCE 314 Student's JavaKnowledge to 0
		this.section = 0;	//sets the CSCE 314 Student's section to 0
	}
	
	public CSCE314Student(String fName, String lName, String sUIN, Rank sRank, int javaKnow, int sec)	//parameterized constructor for Student
	{
		super(fName, lName, sUIN, sRank);	//calls the parameterized super (Student) constructor
		this.JavaKnowledge = javaKnow;	//sets the CSCE 314's JavaKnowledge to int javaKnow
		this.section = sec;	//sets the CSCE 314's section to int sec
	}

	public int getJavaKnowledge()	//getter for the int variable JavaKnowledge
	{
		return this.JavaKnowledge;	//returns the CSCE 314 Student's JavaKnowledge
	}
	
	public void setJavaKnowledge(int jk)	//setter for the it variable JavaKnowledge
	{
		this.JavaKnowledge = jk;	//sets the CSCE 314 Student's JavaKnowledge to int jk
	}
	
	public int getSection()	//getter for the int variable section
	{
		return this.section;	//returns the CSCE 314 Student's section
	}
	
	public void setSection(int s)	//setter for the it variable JavaKnowledge
	{
		this.section = s;	//sets the CSCE 314 Student's JavaKnowledge to int s
	}
	
	@Override
	public String toString()	//Overriden toString method for the CSCE314Student class
	{
		return "First Name: " + super.getFirstName() + ", Last Name: " + super.getLastName() + ", UIN: " + super.getUIN() + ", Rank: " + super.getRank() + ", Java Knowledge: " + JavaKnowledge + ", Section: " + section;
		//returns the CSCE314Student's firstName, lastName, UIN, rank, JavaKnowledge, and section 
	}
}