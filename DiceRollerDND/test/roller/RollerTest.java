package roller;

import static org.junit.Assert.*;
import org.junit.Test;

public class RollerTest {
	private int numTest;
	
	@Test
	public void rollTest() {
		int coin = 2;
		int d4 = 4;
		int d8 = 8;
		int d20 = 20;
		int numTest;
		//Checking the minimum value
		assertEquals(1,Roller.getMin());
		//Creating testing dice
		Roller dice = new Roller();
		/**
		 * The next series of tests verify the integrity of the code for
		 * the above coin and proceeding dice rolls.
		 */
		dice.diceRoll(1, coin);
		assertEquals(dice.getDiceAmount(), 1);
		assertEquals(dice.getDiceType(), 2);
		int twoTest = dice.diceRoll(1, 2);
		if (twoTest > 2 || twoTest < 1) {
			fail();
		}
		
		/**
		 * These next tests utilize the iteratorChecking 
		 * method to verify nothing too high or too low is being rolled
		 */
		iteratorChecking(dice, coin);
		iteratorChecking(dice, d4);
		iteratorChecking(dice, d8);
		iteratorChecking(dice, d20);
		}
	
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
