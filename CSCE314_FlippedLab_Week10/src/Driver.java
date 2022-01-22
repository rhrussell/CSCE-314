import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Block testBlock = new Block("copper", new Location(0, 0, 0), 5);
		//System.out.println(testBlock);
		
		// Character textCharacter = new Character
		// good, just checking, but since Character is abstract, can't create an instance
		
		Villain testVillain = new Villain("Creeper", new Location(0, 1, 0), false, "axe", 6);
		//System.out.println(testVillain);

		
		Hero testHero = new Hero("Bowen", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 5, 0) ;
		//System.out.println(testHero);

		
		ArrayList<Character> BattleRoyale = new ArrayList<Character>();
		//BattleRoyale.add(testBlock); won't work!! (Thankfully)
		BattleRoyale.add(testVillain);
		BattleRoyale.add(testHero);
		//System.out.println("Printing the mother of all battles");
		//System.out.println(BattleRoyale);
		
		//QUESTION 2
		//a
		ArrayList<Character> listVillain = new ArrayList<Character>();
		ArrayList<Character> listHero = new ArrayList<Character>();
		boolean result = false;
		
		Villain v1 = new Villain("Creeper", new Location(1, 1, 1), false, "sword", 11);
		Villain v2 = new Villain("Skeleton", new Location(5, 4, 3), true, "bow", 8);
		Villain v3 = new Villain("Spider", new Location(1, 2, 3), true, "helmet", 6);
		
		
		Hero h1 = new Hero("Steve", new Location(10, 20, 40), Arrays.asList("diamond sword", "beef", "torch"), 22, 100);
		Hero h2 = new Hero("Adam", new Location(-24, 2, 4), Arrays.asList("wood shovel", "pork"), 2, 0);
		Hero h3 = new Hero("Eve", new Location(22, -22, 22), Arrays.asList("gold axe"), 36, 50);
		
		listVillain.add(v1);
		listVillain.add(v2);
		listVillain.add(v3);
		
		listHero.add(h1);
		listHero.add(h2);
		listHero.add(h3);
		
		result = GameMechanics.BattleTester(listHero);
		System.out.println("Result of BattleTester of listHero is: " + result);
		
		result = GameMechanics.BattleTester(listVillain);
		System.out.println("Result of BattleTester of listVillain is: " + result);
		
		//b
		ArrayList<Block> listBlock = new ArrayList<Block>();
		
		Block b1 = new Block("copper", new Location(0, 0, 0), 5);
		Block b2 = new Block("gold", new Location(1, 1, 1), 10);
		Block b3 = new Block("diamond", new Location(5, 5, 5), 50);
		
		listBlock.add(b1);
		listBlock.add(b2);
		listBlock.add(b3);
		
		//result = GameMechanics.BattleTester(listBlock);
		//System.out.println("Results of BattleTester of listBlock is: " + result);
		
		System.out.println();
		
		//QUESTION 3
		GameMechanics.basicWinChances(h1, v1);
		GameMechanics.basicWinChances(h2, v2);
		GameMechanics.basicWinChances(h3, v3);
		GameMechanics.basicWinChances(h1, h2);
		GameMechanics.basicWinChances(v1, v2);
		
		//GameMechanics.basicWinChances(h1, b1);
		
		System.out.println();
		
		//QUESTION 4
		GameMechanics.advancedWinChances(h1, v1);
		GameMechanics.advancedWinChances(h2, v2);
		GameMechanics.advancedWinChances(h3, v3);
		GameMechanics.basicWinChances(h1, h2);
		GameMechanics.basicWinChances(v1, v2);
		
		System.out.println();
		
		//QUESTION 5
		BattleRoyale.add(h1);
		BattleRoyale.add(h2);
		BattleRoyale.add(h3);
		BattleRoyale.add(v1);
		BattleRoyale.add(v2);
		BattleRoyale.add(v3);
		for(int i = 0; i < BattleRoyale.size(); i++)
		{
			System.out.println(BattleRoyale.get(i).toString());
		}
		
		GameMechanics.sortedBattlefieldCharacters(BattleRoyale);
		
		for(int j = 0; j < BattleRoyale.size(); j++)
		{
			System.out.println(BattleRoyale.get(j).toString());
		}
	}

}
