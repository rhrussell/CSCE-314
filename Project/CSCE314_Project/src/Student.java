/*
 * Class Description: Child class to Person that has 2 constructors (default, parameterized), 
 * 					  setters/getters for its String variable UIN and enum Rank rank 
 * 					  and an overriden toString() method. Can also use Person's methods and 
 * 					  has Person's variables. Is also a parent to the CSCE314Student class.
 * 					  This class serves to give functions and demonstrate inheritance with 
 * 					  the CSCE314Student class.
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

public class Student extends Person	//child of the abstract class Person
{
	private String UIN;	//Student's UIN
	private Rank rank;	//Student's Rank(Freshman,Sophomore,Junior,Senior)
	
	public Student()	//default constructor for Student with no parameters
	{
		super();	//calls the default super (Person) constructor
		this.UIN = "";	//sets the Student's UIN to ""
		this.rank = null;	//sets the Student's rank to null
	}

	public Student(String fName, String lName, String sUIN, Rank sRank)	//parameterized constructor for Student
	{
		super(fName, lName);	//calls the parameterized super (Person) constructor
		this.UIN = sUIN;	//sets the Student's UIN to the String parameter sUIN
		this.rank = sRank;	//sets the Student's rank to the enum Rank parameter sRank
	}
	
	public String getUIN()	//getter for the String variable UIN
	{
		return this.UIN;	//returns the Student's UIN
	}
	
	public void setUIN(String sUIN)	//setter for the String variable UIN
	{
		this.UIN = sUIN;	//sets the Student's UIN to the String parameter sUIN
	}

	public Rank getRank()	//getter for the enum Rank rank
	{
		return this.rank;	//returns the Student's rank
	}
	
	public void setRank(Rank sRank)	//setter for the enum Rank rank
	{
		this.rank = sRank;	//sets the Student's Rank to the enum Rank parameter sRank
	}
	
	@Override
	public String toString()	//Overriden toString method for the Student class
	{
		return "First Name: " + super.getFirstName() + ", Last Name: " + super.getLastName() + ", UIN: " + UIN + ", Rank: " + rank;	//returns the Student's firstName, lastName, UIN, and rank 
	}
}