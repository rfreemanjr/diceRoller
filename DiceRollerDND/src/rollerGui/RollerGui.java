package rollerGui;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * RollerGui.java class.
 * This class will produce the Gui that uses the Roller Class
 * @author Ronney Freeman
 * 
 * AUG 7 NOTE:
 *  -This current iteration of the GUI is based on a video tutorial
 *  so it may appear VERY boiler-platey
 *
 */
public class RollerGui {
	public RollerGui() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Roll");
		JPanel panel = new JPanel();
		JLabel resultLabel = new JLabel("ROLL RESULT GOES HERE");
		panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(resultLabel);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Dice Roller");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new RollerGui();
	}

}
