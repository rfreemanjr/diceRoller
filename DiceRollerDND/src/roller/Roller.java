package roller;

/**
 * 
 * roller.java class.
 * @author Ronney Freeman
 * 
 * This class aims to replicate dice rolling for the game
 * Dungeons and dragons
 *
 */
public class Roller {
	private int diceAmount;
	private int diceType;
	private boolean adv;
	private boolean disAdv;
	private int mod;
	private static final int MIN = 1;
	private int max = 0;

//	public roller(int diceAmount, int diceType, boolean adv, boolean disAdv, int mod) {
//		setDiceAmount(diceAmount);
//		setDiceType(diceType);
//		setAdv(adv);
//		setDisAdv(disAdv);
//		setMod(mod);
//	}
	
	public Roller() {
		
	}
	
	public int diceRoll(int amount, int type) {
		this.diceAmount = amount;
		this.diceType = type;
		int roll = 0;
		setMax(diceType);
	    for (int i = 0; i < diceAmount; i++) {
	    	roll += (int)(Math.random() * (max - MIN + 1) + MIN);
		}
		return roll;
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
