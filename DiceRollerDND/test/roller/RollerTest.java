package roller;

import static org.junit.Assert.*;
import org.junit.Test;

public class RollerTest {
	private int numTest;
	private static final Roller DICE = new Roller();
	private static final int COIN = 2;
	private static final int D4 = 4;
	private static final int D8 = 8;
	private static final int D20 = 20;
	/* Input for a single dice */
	private static final int SINGLE_DICE = 1;
	/* This is used to assert the  dice amount for a single dice works */
	private static final int SINGLE_TEST = 1;
	
	
	@Test
	public void rollTest() {
		//Checking the minimum value
		assertEquals(1,Roller.getMin());
		// The next series of tests verify the integrity of the code for
		// the above coin and proceeding dice rolls.
		
		DICE.diceRoll(SINGLE_DICE, COIN);
		assertEquals(DICE.getDiceAmount(), SINGLE_TEST);
		assertEquals(DICE.getDiceType(), COIN);
		int coinTest = DICE.diceRoll(SINGLE_DICE, COIN);
		if (coinTest > 2 || coinTest < 1) {
			fail();
		}
		
		/**
		 * These next tests utilize the iteratorChecking 
		 * method to verify nothing too high or too low is being rolled
		 */
		iteratorChecking(DICE, COIN);
		iteratorChecking(DICE, D4);
		iteratorChecking(DICE, D8);
		iteratorChecking(DICE, D20);
		}
	/**
	 * 
	 * iteratorChecking method.
	 * This method goes through 25 different rolls of the test dice
	 * to verify and check for possible outliers and will return 
	 * a failure if an outlier is detected.
	 * @param diceTest The test Dice
	 * @param diceType The associated test Dice type.
	 */
	public void iteratorChecking(Roller diceTest, int diceType) {
		for (int i = 0; i < 25; i++) {
			numTest = diceTest.diceRoll(4, diceType);
			System.out.println(numTest);
			if (numTest > (diceType * 4) || numTest < 4) {
				fail();
			}
	    }
	}
}
