package dices;

import java.util.Random;

public class Dice {
	private int faces;
	private Random r1;
	
	public Dice(int faces) {
		this.faces = faces;
		r1 = new Random();
	}
	
	public int[] roll(int ammount) {
		int[] results = new int[ammount];
		
		for( int i=0; i<ammount; i++ ) {
			results[i] = r1.nextInt(faces)+1;
		}
		
		return results;
	}
}
