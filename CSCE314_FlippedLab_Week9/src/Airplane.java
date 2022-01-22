public class Airplane extends Vehicle implements Warplane
{
	private String flightNumber;
	private String company;
	private static String country;
	
	public Airplane()
	{
		this.flightNumber = "";
		this.company = "";
	}
	
	public String getFlightNumber() { return flightNumber; }
	public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
	public String getCompany() { return company; }
	public void setCompany(String company) { this.company = company; }

	public String getCountry() { return country; };
	public void setCountry(String country) { this.country = country; };
	public void fireWeapon() { System.out.println("A machine gun will fire"); } ;
	
	public void left() { super.left(); } ;
	public void right() { super.right(); } ;
	public void forward() { super.forward(); } ;
	public void reverse() { super.reverse(); } ;
}
