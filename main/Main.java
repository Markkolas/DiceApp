package main;

import dices.Dice;
import ui.UI;
import java.util.Arrays;

public class Main {
	
	private static final Dice[] dados = { new Dice(2),
									new Dice(4),
									new Dice(6),
									new Dice(8),
									new Dice(10),
									new Dice(12),
									new Dice(20),
									new Dice(100)
										};
	private static UI diceInterface = new UI();
	
	public static void main(String[] args) {
		diceInterface.startUI();
		
	}
	
	public static String roll(int indexDice) {
		
	}

}
