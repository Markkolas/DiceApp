/*
Shitty application made by Marco Antonio Villa aka "El Yoyis".

TO DO list:
	Add usability (queues of throws, probabilities calculator, mixed throws in one result, etc)
	Change the design and implementation of the UI, its so bad it makes me sad
	Make it prettier
	Make it better in general

Special thanks to Diego Dominguez for making me do the piece of garbage this program is (to be fair I only used
3 days making it). Kisses.
*/
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
