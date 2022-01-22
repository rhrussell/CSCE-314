import java.util.*;

public class GameMechanics 
{
	public static boolean BattleTester(ArrayList<? super Character> list)
	{
		boolean result = false;
		
		for(int i = 0; i < list.size(); i++)
		{
			if((list.get(i) instanceof Hero))
			{
				result = true;
			}
			else
			{
				result = false;
				return result;
			}
		}
		
		return result;
	}
	
	public static void basicWinChances(Character characterOne, Character characterTwo)
	{
		int characterOneHearts = 0;
		int characterTwoHearts = 0;
		int ratioNum = 0;
		String winner = "";
		String ratio = "";
		
		if((characterOne instanceof Hero) && (characterTwo instanceof Hero))
		{
			System.out.println("ERROR: Characters are the same. Hero vs Hero is not allowed.");
			return;
		}
		else if((characterOne instanceof Villain) && (characterTwo instanceof Villain))
		{
			System.out.println("ERROR: Characters are the same. Villain vs Villain is not allowed.");
			return;
		}
		else
		{
			characterOneHearts = characterOne.getHearts();
			characterTwoHearts = characterTwo.getHearts();
			
			if(characterOneHearts < characterTwoHearts)
			{
				ratioNum = characterTwoHearts/characterOneHearts;
				ratio = "Ratio is 1 to " + ratioNum;
				winner = "Winner is " + characterTwo.getName();
				System.out.println(ratio);
				System.out.println(winner);
			}
			else
			{
				ratioNum = characterOneHearts/characterTwoHearts;
				ratio = "Ratio is " + ratioNum + " to 1";
				winner = "Winner is " + characterOne.getName();
				System.out.println(ratio);
				System.out.println(winner);
			}
		}
	}
	
	public static void advancedWinChances(Character characterOne, Character characterTwo)
	{
		double characterOneHearts = 0.0;
		double characterTwoHearts = 0.0;
		double ratioNum = 0;
		String winner = "";
		String ratio = "";
		
		
		characterOneHearts = characterOne.getHearts();
		characterTwoHearts = characterTwo.getHearts();
		
		if((characterOne instanceof Hero) && (characterTwo instanceof Hero))
		{
			System.out.println("ERROR: Characters are the same. Hero vs Hero is not allowed.");
			return;
		}
		else if((characterOne instanceof Villain) && (characterTwo instanceof Villain))
		{
			System.out.println("ERROR: Characters are the same. Villain vs Villain is not allowed.");
			return;
		}
		else
		{
			if(characterOne instanceof Hero)
			{
				characterOneHearts = characterOneHearts + characterOneHearts * (1.5 * ((Hero) characterOne).getArmour() / 100);
			}
			if(characterTwo instanceof Hero)
			{
				characterTwoHearts = characterTwoHearts + characterTwoHearts * (1.5 * ((Hero) characterTwo).getArmour() / 100);
			}
			if(characterOneHearts < characterTwoHearts)
			{
				ratioNum = characterTwoHearts/characterOneHearts;
				ratio = "Ratio is 1 to " + ratioNum;
				winner = "Winner is " + characterTwo.getName();
				System.out.println(ratio);
				System.out.println(winner);
			}
			else
			{
				ratioNum = characterOneHearts/characterTwoHearts;
				ratio = "Ratio is " + ratioNum + " to 1";
				winner = "Winner is " + characterOne.getName();
				System.out.println(ratio);
				System.out.println(winner);
			}
		}
	}

	public static void sortedBattlefieldCharacters(ArrayList<Character> list)
	{
		Collections.sort(list);
		Collection.reverse(list);
	}
}