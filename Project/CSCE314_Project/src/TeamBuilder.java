/*
 * Class Description:
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

import java.util.*;

public class TeamBuilder 
{
	private CSCE314Student teams;
	private Utility util;
	private JavaKnowledgeComparator compare;
	private ArrayList<String> teamsList;
	
	public TeamBuilder()	//default constructor with no parameters
	{
		this.teams = new CSCE314Student();	//objects used to create the teams of students
		this.util = new Utility();	//reading/writing results and holding the students in a list
		this.compare = new JavaKnowledgeComparator();	//sorting the students by JK
		this.teamsList = new ArrayList<String>();	//the arraylist that holds these teams by Strings
	}
	
	public CSCE314Student getTeams()	//getter function for the CSCE314Student object teams
	{
		return this.teams;	//returns teams
	}
	
	public void setTeams(CSCE314Student team)	//setter function for the CSCE314Student object teams
	{
		this.teams = team;	//sets teams to CSCE314Student team
	}
	
	public Utility getUtil()	//getter function for the Utility object util
	{
		return this.util;	//returns util
	}
	
	public void setUtil(Utility ut)	//setter function for the Utility object util
	{
		this.util = ut;	//sets util to Utility ut
	}
	
	public JavaKnowledgeComparator getCompare()	//getter function for the JavaKnowledgeComparator compare
	{
		return this.compare;	//returns compare
	}
	
	public void setCompare(JavaKnowledgeComparator comp)	//setter function for the JavaKnowledgeComparator compare
	{
		this.compare = comp;	//sets compare to JavaKnowledgeComparator comp
	}
	
	public ArrayList<String> getTeamsList()	//getter function for the ArrayList<String> teamsList
	{
		return this.teamsList;	//returns teamsList
	}
	
	public void setTeamsList(ArrayList<String> list)	//setter function for the ArrayList<String> teamsList
	{
		this.teamsList = list;	//sets teamsList to ArrayList<String>
	}
	
	public void createTeams()	//function that creates the teams
	{
		util.readFile("C:\\Ryan Russell\\College\\Texas A&M\\Sophomore\\Summer 2020\\Courses\\CSCE 314(10 Week)\\Project\\CSCE314_Project\\src\\CSCE 314 Spring 2020 Project 1 Survey Data  - Form Responses 1.csv"); //reads file from util
		int first = 0;
		int last = 0;
		int size = 0;
		int middle = 0;
		String line = "";	//variables initialized
		
		ArrayList<CSCE314Student> sections = util.getSections();	//gets the sections ArrayList full of CSCE314Students
		ArrayList<CSCE314Student> section502 = new ArrayList<CSCE314Student>();
		ArrayList<CSCE314Student> section503 = new ArrayList<CSCE314Student>();
		ArrayList<CSCE314Student> thirdSection = new ArrayList<CSCE314Student>();	//creates individual section ArrayLists
		
		for(int i = 0; i < sections.size(); i++)	//goes through to see which section ArrayList a student belongs to
		{
			CSCE314Student loop = sections.get(i);
			
			if(loop.getSection() == 502)	//student is in 502
			{
				section502.add(loop);
			}
			else if(loop.getSection() == 503)	//student is in 503
			{
				section503.add(loop);
			}
			else
			{
				thirdSection.add(loop);	//student is a random section
			}
		}
		
		Collections.sort(sections, compare);	//sorts each list by JK
		Collections.sort(section502, compare);
		Collections.sort(section503, compare);
		Collections.sort(thirdSection, compare);
		
		CSCE314Student studentOne = new CSCE314Student();
		CSCE314Student studentTwo = new CSCE314Student();
		CSCE314Student singlePartner = new CSCE314Student();
		
		if(section502.size() % 2 == 0 && section502.size() != 0)	//If the size of the list != 0 and there are an even amount of CSCE314Students
		{
			first = 0;
			last = section502.size() - 1;
			while(first < last)
			{
				studentOne = section502.get(first);
				studentTwo = section502.get(last);	//gets the two students 
				line = studentOne.getSection() + " - " + studentOne.getFirstName() + " " + studentOne.getLastName() + " (" + studentOne.getUIN() + ") (" + studentOne.getJavaKnowledge() + ") -- " + studentTwo.getFirstName() + " " + studentTwo.getLastName() + " (" + studentTwo.getUIN() + ") (" + studentTwo.getJavaKnowledge() + ")";
				teamsList.add(line);	//adds their info to the list
				first++;
				last--;	//move on to the next pair
			}
		}
		else	//Odd number of students, someone is going to not have a partner
		{
			size = section502.size();
			middle = size/2;
		
			singlePartner = section502.get(middle);
			section502.remove(middle);
			
			first = 0;
			last = section502.size() - 1;
			while(first < last)
			{
				studentOne = section502.get(first); //gets the two students
				studentTwo = section502.get(last);
				line = studentOne.getSection() + " - " + section502.get(first).getFirstName() + " " + section502.get(first).getLastName() + " (" + section502.get(first).getUIN() + ") (" + section502.get(first).getJavaKnowledge() + ") -- " + section502.get(last).getFirstName() + " " + section502.get(last).getLastName() + " (" + section502.get(last).getUIN() + ") (" + section502.get(last).getJavaKnowledge() + ")";
				teamsList.add(line);	//adds their info to the list
				first++;
				last--;	//move on to the next pair
			}
			line = singlePartner.getSection() + " - " + singlePartner.getFirstName() + " " + singlePartner.getLastName() + " (" + singlePartner.getUIN() + ") (" + singlePartner.getJavaKnowledge() + ")";
			teamsList.add(line);	//gets the individual's info and adds it to the list
		}
		
		if(section503.size() % 2 == 0 && section503.size() != 0) //If the size of the list != 0 and there are an even amount of CSCE314Students
		{
			first = 0;
			last = section503.size();
			while(first < last)
			{
				studentOne = section503.get(first);
				studentTwo = section503.get(last); //gets the two students
				line = studentOne.getSection() + " - " + studentOne.getFirstName() + " " + studentOne.getLastName() + " (" + studentOne.getUIN() + ") (" + studentOne.getJavaKnowledge() + ") -- " + studentTwo.getFirstName() + " " + studentTwo.getLastName() + " (" + studentTwo.getUIN() + ") (" + studentTwo.getJavaKnowledge() + ")";
				teamsList.add(line);    //add their info to the list 
				first++;	//move on to the next pair
				last--;
			}
		}
		else //Odd number of students, someone is going to not have a partner
		{
			size = section502.size();
			middle = size/2;
			
			singlePartner = section503.get(middle);
			section502.remove(middle);
			
			first = 0;
			last = section503.size() - 1;
			while(first < last)
			{
				studentOne = section503.get(first);
				studentTwo = section503.get(last);	//gets the two students
				line = studentOne.getSection() + " - " + studentOne.getFirstName() + " " + studentOne.getLastName() + " (" + studentOne.getUIN() + ") (" + studentOne.getJavaKnowledge() + ") -- " + studentTwo.getFirstName() + " " + studentTwo.getLastName() + " (" + studentTwo.getUIN() + ") (" + studentTwo.getJavaKnowledge() + ")";
				teamsList.add(line);   	//add their info to the list 
				first++;	//move on to the next pair
				last--;
			}
			
			line = singlePartner.getSection() + " - " + singlePartner.getFirstName() + " " + singlePartner.getLastName() + " (" + singlePartner.getUIN() + ") (" + singlePartner.getJavaKnowledge() + ")";
			teamsList.add(line);	//gets the indiviual's info and adds info to list
		}
		
		if(thirdSection.size() % 2 == 0 && thirdSection.size() != 0) //If the size of the list != 0 and there are an even amount of CSCE314Students
		{
			first = 0;
			last = thirdSection.size() - 1;
			while(first < last)
			{
				studentOne = thirdSection.get(first);
				studentTwo = thirdSection.get(last); //gets the two students
				line = studentOne.getSection() + " - " + studentOne.getFirstName() + " " + studentOne.getLastName() + " (" + studentOne.getUIN() + ") (" + studentOne.getJavaKnowledge() + ") -- " + studentTwo.getFirstName() + " " + studentTwo.getLastName() + " (" + studentTwo.getUIN() + ") (" + studentTwo.getJavaKnowledge() + ")";
				teamsList.add(line);	//add their info to the list
				first++;
				last--;	//move on to the next pair
			}
		}
		else if(thirdSection.size() != 0) //If the size of the list != 0 and there are an odd amount of CSCE314Students, someone will go without a partner
		{
			size = thirdSection.size();
			middle = size/2;
		
			singlePartner = thirdSection.get(middle);
			section502.remove(middle);
			
			first = 0;
			last = thirdSection.size() - 1;
			while(first < last)
			{
				studentOne = thirdSection.get(first);
				studentTwo = thirdSection.get(last);	//gets the two students
				line = studentOne.getSection() + " - " + section502.get(first).getFirstName() + " " + section502.get(first).getLastName() + " (" + section502.get(first).getUIN() + ") (" + section502.get(first).getJavaKnowledge() + ") -- " + section502.get(last).getFirstName() + " " + section502.get(last).getLastName() + " (" + section502.get(last).getUIN() + ") (" + section502.get(last).getJavaKnowledge() + ")";
				teamsList.add(line);	//add their info to the list
				first++;
				last--;	//move on to the next pair
			}
			line = singlePartner.getSection() + " - " + singlePartner.getFirstName() + " " + singlePartner.getLastName() + " (" + singlePartner.getUIN() + ") (" + singlePartner.getJavaKnowledge() + ")";
			teamsList.add(line);	//gets the individual, adds their info to the list
		}
	}
	
	public void computeResults()	//does the writing of the results
	{
		util.writeResults();	//using util to do
	}
}