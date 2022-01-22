import java.util.ArrayList;
import java.util.List;

public class Hero extends Character
{
	private int armour; // [0 - 100%]

	public Hero(String name, Location location, List<String> carrying, int hearts, int armour) 
	{
		// taking care of items needed for Item
		super(name, location);
		// taking care of abstract items from Character
		super.carrying = new ArrayList<String>();
		super.carrying = carrying; // passed in from constuctor
		super.hearts = hearts;	
		this.armour = armour;
	}
	
	public int getArmour() { return armour; }
	public void setArmour(int armour) { this.armour = armour; } 
	public String getCarrying() { return super.carrying.toString(); }
	public void setCarrying(String thing) { super.carrying = thing; };
	

	@Override
	public String toString() {
		return "Hero [armour=" + armour + ", hearts=" + hearts + ", carrying=" + getCarrying() + ", name=" + name
				+ ", location=" + location + "]";
	}	
	
	public int compareTo(Character otherChar)
	{
		int result = 0;
		double characterOneHearts = 0.0;
		double characterTwoHearts = 0.0;
		
		characterOneHearts = hearts + hearts * (1.5 * armour / 100);
		characterTwoHearts = otherChar.getHearts();

		if (otherChar instanceof Hero)
		{
			characterTwoHearts = characterTwoHearts + characterTwoHearts * (1.5 * ((Hero) otherChar).getArmour() / 100);
		}

		if (characterOneHearts < characterTwoHearts)
		{
			result = -1;
		} 
		else if (characterOneHearts > characterTwoHearts)
		{
			result = 1;
		} 
		else
		{
			result = 0;
		}
		
		return result;
	}
	
}
