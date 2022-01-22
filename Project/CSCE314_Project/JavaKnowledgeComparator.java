/*
 * Class Description: This class creates the ability for two CSCE314Students to be compared
 * 					  , which is used in sorting the students  by java knowledge. 
 * 					  Then the formula described in the video can be implemented
 * 					  in TeamBuilder. Implements Comparator interface and overrides compare
 * 					  for CSCE314Student objects
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */
import java.util.*;

public class JavaKnowledgeComparator implements Comparator<CSCE314Student>	//implements Comparator to be able to compare by java knowledge
{
	public int compare(CSCE314Student studentOne, CSCE314Student studentTwo)	
	{
		int compare = 0;
		
		if(studentOne.getJavaKnowledge() < studentTwo.getJavaKnowledge())	//studentOne's JK is smaller than studentTwo's JK
		{
			compare = -1;	//result is -1 for less than
		}
		
		else if(studentOne.getJavaKnowledge() > studentTwo.getJavaKnowledge())	//studentOne's JK is greater than studentTwo's JK
		{
			compare = 1;	//result is 1 for greater than
		}
		else	//studentOne's JK is equal to studentTwo's JK
		{
			compare = 0;	//result is 0 for both equal
		}
		
		return compare;	//return result
	}
}