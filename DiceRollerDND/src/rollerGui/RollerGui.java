package rollerGui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import roller.Roller;

/**
 * RollerGui.java class.
 * This class will produce the Gui that uses the Roller Class
 * @author Ronney Freeman
 * 
 * AUG 7 NOTE:
 *  -This current iteration of the GUI is based on a video tutorial
 *  so it may appear VERY boiler-platey
 *  
 *  AUG 13 NOTE:
 *  Some changes were made, so it shouldn't look as boiler-platey as before, but still
 *  has something similar with a bunch of simple Java guis out there.
 *
 */
public class RollerGui implements ActionListener{
	private Roller dice = new Roller();
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	private JLabel resultLabel;
	private JLabel chooseDice;
	private int[] diceAmountInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private int[] diceTypeInt = {4, 6, 8, 10, 12, 20};
	private String[] diceTypeString = {"D4", "D6", "D8", "D10", "D12", "D20"};
	private String[] diceAmountString = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	private JComboBox amountDice;
	private JComboBox selectDice;
	private JComboBox selectDiceString;
	/**
	 * This gui is a simple gui to provide direct user control for
	 * a simple dice rolling mechanic.
	 * RollerGui.java's constructor.
	 */
	public RollerGui() {
		amountDice = new JComboBox(diceAmountString);
		amountDice.setSelectedIndex(9);
		selectDice = new JComboBox(diceTypeString);
		selectDice.setSelectedIndex(5);
		
		frame = new JFrame();
		button = new JButton("Roll");
		//Primary button
		button.addActionListener(this);
		panel = new JPanel();
		resultLabel = new JLabel("0");
//		chooseDice = new JLabel(" ");
		panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
		panel.setLayout(new GridLayout(2, 3));
		panel.add(amountDice);
		panel.add(selectDice);
//		panel.add(chooseDice);
		panel.add(button);
		panel.add(resultLabel);
		//Sets the frame up
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Dice Roller");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new RollerGui();
	}
	/**
	 * This will roll the dice as per the users clicks on the appropriate
	 * indices provided.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int diceType = diceTypeInt[selectDice.getSelectedIndex()];
		int diceAmount = diceAmountInt[amountDice.getSelectedIndex()];
		resultLabel.setText("" + dice.diceRoll(diceAmount, diceType));
		
	}

}
