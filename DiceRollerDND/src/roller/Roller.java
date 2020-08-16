package roller;

/**
 * 
 * roller.java class.
 * @author Ronney Freeman
 * 
 * This class aims to replicate dice rolling for the game
 * Dungeons and dragons and should be able to accommodate 
 * any number dice both in and out of the game itself.
 * Most of this code assumes the reader/user is familiar
 * with Dungeons and dragons terminology and mechanics.
 * 
 *
 */
public class Roller {
	/* the amount of dice being rolled */
	private int diceAmount;
	/* The type of dice being rolled */
	private int diceType;
	/* If the roll has advantage or not */
	private boolean adv;
	/* If the roll has disadvantage */
	private boolean disAdv;
	/* If the dice need a modifier to the roll */
	private int mod;
	/* The minimum dice value */
	private static final int MIN = 1;
	/*The maximum dice value */
	private int max = 0;
	/*Initial roll value for dice */
	private int roll = 0;
	/**
	 * 
	 * This method returns a value associated with the dice roll
	 * and also the the amount of dice the player wishes to roll 
	 * of the said dice.
	 * @param amount this is the amount of dice rolled
	 * @param type the dice of dice being rolled
	 * @return the total of the dice roll
	 */
	public int diceRoll(int amount, int type) {
		setDiceAmount(amount);
		setDiceType(type);
		setMax(diceType);
		setRoll();
	    for (int i = 0; i < diceAmount; i++) {
	    	roll += (int)(Math.random() * (max - MIN + 1) + MIN);
		}
		return roll;
	}
	/**
	 * Gets the roll
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}
	/**
	 * Sets the roll
	 * Specifically, this setter will always reset the roll
	 * to 0 in order to re-use the diceRoller.
	 * @param roll the roll that will be set
	 */
	public void setRoll() {
		this.roll = 0;
	}
	/**
	 * Gets the min
	 * @return the min
	 */
	public static int getMin() {
		return MIN;
	}


	/**
	 * Returns the amount of dice rolled
	 * @return the diceAmount
	 */
	public int getDiceAmount() {
		return diceAmount;
	}

	/**
	 * Sets the amount of dice rolled
	 * @param diceAmount the diceAmount that will be set
	 */
	public void setDiceAmount(int diceAmount) {
		this.diceAmount = diceAmount;
	}

	/**
	 * Gets the diceType
	 * @return the diceType
	 */
	public int getDiceType() {
		return diceType;
	}

	/**
	 * Sets the diceType
	 * @param diceType the diceType that will be set
	 */
	public void setDiceType(int diceType) {
		this.diceType = diceType;
	}

	/**
	 * Returns if the player has advantage or not.
	 * @return the adv
	 */
	public boolean isAdv() {
		return adv;
	}

	/**
	 * Returns true if the player has advantage on the dice roll or not
	 * @param adv the adv that will be set
	 */
	public void setAdv(boolean adv) {
		this.adv = adv;
	}

	/**
	 * Gets the disAdv
	 * @return the disAdv
	 */
	public boolean isDisAdv() {
		return disAdv;
	}

	/**
	 * Sets the disAdv
	 * @param disAdv the disAdv that will be set
	 */
	public void setDisAdv(boolean disAdv) {
		this.disAdv = disAdv;
	}

	/**
	 * Gets the mod
	 * @return the mod
	 */
	public int getMod() {
		return mod;
	}

	/**
	 * Sets the mod
	 * @param mod the mod that will be set
	 */
	public void setMod(int mod) {
		this.mod = mod;
	}

	/**
	 * Gets the max
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Sets the max
	 * @param max the max that will be set
	 */
	public void setMax(int max) {
		this.max = max;
	}
}
