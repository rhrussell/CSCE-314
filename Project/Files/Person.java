public abstract class Person
{
	String firstName;
	String lastName;
	//Enum gender;
	
	abstract void setFirstName();
	abstract void setLastName();
	abstract String getFirstName();
	abstract String getLastName();
	//abstract Enum getGender();
}