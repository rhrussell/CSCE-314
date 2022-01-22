public class Car extends Vehicle
{
	private String licensePlate;
	
	public Car()
	{
		this.licensePlate = "";
	}
	
	public String getLicense() { return licensePlate; }
	public void setLicense(String licensePlate) { this.licensePlate = licensePlate; }
	
	public void left() { super.left(); } ;
	public void right() { super.right(); } ;
	public void forward() { super.forward(); } ;
	public void reverse() { super.reverse(); } ;
}
