/*
 * Class Description: This class creates the ArrayList for the two or more sections in the data
 * 					  file, reads in the file (writing errors if there is any) and writing the errors 
 * 					  to ErrorLog.txt and the results to results.txt. Also has a getter for the 
 * 					  ArrayList. Used by the TeamBuilder class to read and write the files 
 * 						
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

import java.util.*;
import java.io.*;

public class Utility 
{
	private ArrayList<CSCE314Student> sections;	//holds all the students from every section sorted by section
	
	public Utility()	//default constructor with no parameters
	{
		this.sections = new ArrayList<CSCE314Student>();	//sets sections to a new ArrayList of CSCE314Student objects
	}
	
	public ArrayList<CSCE314Student> getSections()	//getter for sections ArrayList
	{
		return this.sections;	//returns sections ArrayList
	}
	
	public boolean readFile(String fileName)	//reads in a file by name (String fileName) and puts the students into the arraylist and sorts them by section
	{
		boolean readFileResult = false;	//result initialized
		String line = "";
		String name = "";
		String firstName = "";
		String lastName = "";
		String UIN = "";
		String strUIN = "";
		String strSection = "";
		String strRank = "";	//String values initialized
		int javaKnowledge = 0;
		int section = 0;
		int rankNum = 0;	//int values initialized
		
		try 
		{
			Scanner scan = new Scanner(new File(fileName));	//Scanner for the file
			File errorFile = new File("ErrorLog.txt");	//creates the file
			
			if(!errorFile.exists())
			{
				errorFile.createNewFile();	//tests to see if it does not already exist, if not then create a new file
			}
			
			FileWriter writer = new FileWriter(errorFile);	//writer to the file
			
			scan.nextLine();	//skip the header line
			
			while(scan.hasNext())	//while the line has tokens (String) 
			{
				line = scan.nextLine();	//gets the Student's data
				String[] arr = line.split(",");	//splits it by , into an array
				name = arr[4];
				String[] arrName = name.split(" ");	//splits the name by first and last name and gets them from their respective indices
				firstName = arrName[0];
				lastName = arrName[1];
				strSection = arr[5];	//gets section
				
				try
				{
					section = Integer.parseInt(strSection.substring(0,3));	//tests to see if section is an actual number
				}
				catch(NumberFormatException x)	//if not then we report the error
				{
					if(errorFile.exists())
					{
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid section. (Not an integer)\n");
					}
					else
					{
						try
						{
							errorFile.createNewFile();
						}
						catch(IOException e)
						{
							writer.write("Error located in Utility.java\n");
							writer.write("IOException occured when creating file\n");
						}
						
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid section. (Not an integer)\n");
					}
				}
				
				try
				{
					javaKnowledge = Integer.parseInt(arr[1]);	//do the same thing for javaKnowledge
				}
				catch(NumberFormatException ex)
				{
					if(errorFile.exists())
					{
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid java knowledge. (Not between 1 to 5 or not an integer)\n");
					}
					else
					{
						try
						{
							errorFile.createNewFile();
						}
						catch(IOException e)
						{
							writer.write("Error located in Utility.java\n");
							writer.write("IOException occured when creating file\n");
						}
						
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid java knowledge. (Not between 1 to 5 or not an integer)\n");
					}
				}
				if(!((javaKnowledge >= 1) && (javaKnowledge <= 5)))	//check to see if javaKnowledge is valid (not negative and not greater than 5 and is an integer)
				{
					if(errorFile.exists())
					{
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid java knowledge. (Not between 1 to 5 or not an integer)\n");
					}
					else
					{
						try
						{
							errorFile.createNewFile();
						}
						catch(IOException e)
						{
							writer.write("Error located in Utility.java\n");
							writer.write("IOException occured when creating file\n");
						}
						
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid java knowledge. (Not between 1 to 5 or not an integer)\n");
					}
				}
				strUIN = arr[6];
				if(!(strUIN.contains("@")))	//tests to see if the UIN is valid
				{
					if(errorFile.exists())
					{
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid email address/UIN\n");
					}
					else
					{
						try
						{
							errorFile.createNewFile();
						}
						catch(IOException e)
						{
							writer.write("Error located in Utility.java\n");
							writer.write("IOException occured when creating file\n");
						}
						
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid email address/UIN.\n");
					}
				}
				String[] arrUIN = strUIN.split("@");
				UIN = arrUIN[0];
				strRank = arr[7];
				Rank rank = null;
				
				if (strRank.matches("\\d+")) //Tests Rank to see if it works
				{
					for (Rank test: Rank.values())
					{
						rankNum = Integer.parseInt(strRank);
						if (rankNum == test.getValue())
						{
							rank = test;
						}
					}
				}
				
				CSCE314Student student = new CSCE314Student(firstName, lastName, UIN, rank, javaKnowledge, section);	//creates a new student object from the data
				
				if(rank == null)	//rank is still null after this time meaning an error in rank
				{
					if(errorFile.exists())
					{
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid rank. (Not between 1 to 4 or not an integer)\n");
					}
					else
					{
						try
						{
							errorFile.createNewFile();
						}
						catch(IOException e)
						{
							writer.write("Error located in Utility.java\n");
							writer.write("IOException occured when creating file\n");
						}
						
						writer.write("Error located in Utility.java\n");
						writer.write(firstName + " " + lastName + " has an invalid rank. (Not between 1 to 4 or not an integer)\n");
					}
				}
				
				sections.add(student);	//adds the student to the list
			}
			
			writer.close();	//close the file writer
			
			SectionComparator sc = new SectionComparator();
			sections.sort(sc);	//sorts the list by section
			readFileResult = true;	//reading the file was a success; return true
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		
		return readFileResult; //returning the result
	}
	
	public boolean writeResults()	//writes the results to a file
	{
		boolean writeResults = false;	//initializing the result
		TeamBuilder teams = new TeamBuilder();	//creating the TeamBuilder object
		ArrayList<String> list = new ArrayList<String>();	//list will hold the teams in Strings
		String line = "";	//String variable initialized
		
		try
		{
			File resultFile = new File("results.txt");	//creates the results file
			
			if(!resultFile.exists())
			{
				resultFile.createNewFile();	//if the file doesnt already exists then create it 
			}
			
			FileWriter writer = new FileWriter(resultFile);	//writer to the file
			
			teams.createTeams();	//creates the teams 
			list = teams.getTeamsList();	//teams in the list
			
			Iterator<String> iter = list.iterator();	//iterator to go through the list
			while(iter.hasNext())
			{
				line = iter.next();	//traversing the list
				writer.write(line + "\n");	//writing the results onto the file
			}
			
			writer.close();	//closing the writer
			
			writeResults = true;	//writing to the file was successful return true
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return writeResults;
	}
}