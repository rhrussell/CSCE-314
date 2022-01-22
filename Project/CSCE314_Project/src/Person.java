/*
 * Class Description: abstract class Person that has 2 constructors (default, parameterized), 
 * 					  setters/getters for its two String variables firstName and lastName 
 * 					  and an overriden toString() method. Is also the parent class to the 
 * 					  Student class which is a parent to the CSCE314Student class.This class 
 * 					  serves to give functions and demonstrate inheritance with the 
 * 					  CSCE314Student class.
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

public abstract class Person
{
	String firstName;	//Person's firstName
	String lastName;	//Person's lastName
	
	public Person()		//default constructor for Person with no parameters
	{
		this.firstName = "";	//sets the Person's firstName to ""
		this.lastName = "";		//sets the Person's lastName to ""
	}
	
	public Person(String fName, String lName)	//parameterized constructor for Person
	{
		this.firstName = fName;	//sets the Person's firstName to the String parameter fName
		this.lastName = lName;	//sets the Person's lastName to the String parameter lName
	}
	
	public String getFirstName()	//getter for the String variable firstName
	{
		return this.firstName;	//returns the Person's firstName
	}
	
	public void setFirstName(String fName)	//setter for the String variable firstName
	{
		this.firstName = fName;	//sets the Person's firstName to the String parameter fName
	}
	
	public String getLastName()	//getter for the String variable lastName
	{
		return this.lastName;	//returns the Person's lastName
	}
	
	public void setLastName(String lName)	//setter for the String variable lastName
	{
		this.lastName = lName;	//sets the Person's lastName to the String parameter lName
	}
	
	@Override
	public String toString()	//Overriden toString method for the Person class
	{
		return "First Name: " + firstName + ", Last Name: " + lastName;	//returns the Person's firstName and lastName
	}
}