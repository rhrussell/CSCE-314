/*
 * Class Description: This class runs the TeamBuilder class by creating a TeamBuilder object which will
 * 					  read in the file, sort them by sections and by java knowledge, create the teams based
 * 					  on their knowledge, and write these results to a file. TeamBuilder uses the CSCE314Student, Utility,
 * 					  and JavaKnowledgeComparator class to do these tasks. 
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

public class Driver
{
    public static void main(String[] args) throws Exception
    {
    	TeamBuilder teamMaker = new TeamBuilder();	//creates the TeamBuilder Object
    	teamMaker.computeResults();	//creates two new files (results and ErrorLog) and writes those results
    								//to those files
    }
}