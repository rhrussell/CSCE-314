/*
 * Class Description: This class creates the ability for two CSCE314Students to be compared
 * 					  , which is used in sorting the students by section. Then the formula 
 *                    described in the video can be implemented in TeamBuilder. 
 *                    Implements Comparator interface and overrides compare for 
 *                    CSCE314Student objects
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */
import java.util.*;

public class SectionComparator implements Comparator<CSCE314Student>	//implements Comparator to be able to compare by section
{
	public int compare(CSCE314Student studentOne, CSCE314Student studentTwo)
	{
		int compare = 0;
		
		if(studentOne.getSection() < studentTwo.getSection())	//studentOne's Section is smaller than studentTwo's Section
		{
			compare = -1;	//result is -1 for less than
		}
		
		else if(studentOne.getSection() > studentTwo.getSection())	//studentOne's Section is greater than studentTwo's section
		{
			compare = 1;	//result is 1 for greater than
		}
		else	//studentOne's section is equal to studentTwo's section
		{
			compare = 0;	//result is 0 for both equal
		}
		
		return compare;	//return the result
	}
}