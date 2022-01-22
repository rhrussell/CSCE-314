/*
 * Class Description: This class creates the enum Rank used by the Student and CSCE314Student
 * 					  class which determines what year the student is in the course 
 * 					  (i.e freshman, sophomore, junior, or senior). This class is used in 
 * 					  helping to create CSCE314Student objects.
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

public enum Rank	//Enum for Student's and CSCE314Student's Rank(Class Year)
{
	Freshman(1), Sophomore(2), Junior(3), Senior(4);
	/*
	 * Freshman = 1
	 * Sophomore = 2
	 * Junior = 3
	 * Senior = 4
	 */
	private int rankNumber;	//int variable to hold the number to determine the enum
	
	Rank(int num)	//enum constructor that holds an int parameter num
	{
		this.rankNumber = num;	//sets rankNumber to int num
	}
	
	public int getValue()	//getter for int rankNumber
	{
		return this.rankNumber;	//returns the enum's rankNumber
	}
}