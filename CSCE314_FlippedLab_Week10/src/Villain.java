
public class Villain extends Character
{
	private boolean nocturnal;

	

	public Villain(String name, Location location, boolean nocturnal, String carrying, int hearts) 
	{
		// taking care of items needed for Item
		super(name, location);
		// taking care of abstract items from Character
		super.carrying = new String();
		super.carrying = carrying; // passed in from constuctor
		super.hearts = hearts;	
		this.nocturnal = nocturnal;
	}
	
	public boolean isNocturnal() { return nocturnal; }
	public void setNocturnal(boolean nocturnal) { this.nocturnal = nocturnal; } 
	public String getCarrying() { return (String) super.carrying; }
	public void setCarrying(String thing) { super.carrying = thing; };
	

	@Override
	public String toString() {
		return "Villain [nocturnal=" + nocturnal + ", hearts=" + hearts + ", carrying=" + getCarrying() + ", name=" + name
				+ ", location=" + location + "]";
	}	
	
	public int compareTo(Character otherChar)
	{
		int result = 0;
		double characterOneHearts = 0.0;
		double characterTwoHearts = 0.0;
		
		characterOneHearts = hearts;
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
