package statvars.statmethods;

import java.util.Random;

public class Dice {

	static int sidesOfDice = 6;
	int faceValue = 0;

	public int roll() {
		Random rand = new Random();
		this.faceValue = rand.ints(1, sidesOfDice + 1).findFirst().getAsInt();
		return this.faceValue;
	}

	public int getFaceValue() {
		return this.faceValue;
	}

	public static void changeNumSidesOfDice(int sides) {
		Dice.sidesOfDice = sides;
		
	}

}
