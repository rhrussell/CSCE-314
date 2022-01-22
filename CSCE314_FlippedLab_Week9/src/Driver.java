public class Driver 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(100.0F);
		System.out.println("Vehicle speed is: " + vehicle.getSpeed());
		
		Car car = new Car();
		car.setSpeed(75.0F);
		System.out.println("Car speed is: " + car.getSpeed());
		
		Airplane plane = new Airplane();
		plane.setSpeed(2022.0F);
		System.out.println("Plane speed is: " + plane.getSpeed());
		
		Warplane war = new Airplane();
		war.fireWeapon();
		war.setCountry("United States of America");
		System.out.println("Warplane country is: " + war.getCountry());
	}
}
