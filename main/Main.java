package main;

import dices.Dice;
import ui.UI;

public class Main {
	
	private static final Dice[] dados = { new Dice(2, "d2"),
									new Dice(4, "d4"),
									new Dice(6, "d6"),
									new Dice(8, "d8"),
									new Dice(10, "d10"),
									new Dice(12, "d12"),
									new Dice(20, "d20"),
									new Dice(100, "d100")
										};
	
	private static UI diceInterface = new UI();
	
	public static void main(String[] args) {
		diceInterface.startUI();
	}
	
	public static void roll(int indexDice, int timesToRoll) {
		int[] result = dados[indexDice].roll(timesToRoll);
		diceInterface.showResults(result, indexDice, timesToRoll, dados[indexDice].getTipo());
	}

}
