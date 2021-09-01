package main;

import dices.Dice;
import ui.UI;
import java.util.Arrays;

public class Main {
	
	/*Instanciación de dados. Se podría hacer con un array de objetos pero
	 ofuscaria la progamacion. No es muy elegante pero si sencillo.*/
	private static final Dice d2 = new Dice(2);
	private static final Dice d4 = new Dice(4);
	private static final Dice d6 = new Dice(6);
	private static final Dice d8 = new Dice(8);
	private static final Dice d10 = new Dice(10);
	private static final Dice d12 = new Dice(12);
	private static final Dice d20 = new Dice(20);
	private static final Dice d100 = new Dice(100);
	private static UI diceInterface = new UI();
	
	public static void main(String[] args) {
		diceInterface.startUI();
		
	}

}
