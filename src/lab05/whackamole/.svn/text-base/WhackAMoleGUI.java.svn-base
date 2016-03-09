package lab05.whackamole;

import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

/**
 * A GUI for the Whack-a-Mole game.
 * 
 * @author Grant Braught
 * 
 * @author
 * @version
 */
public class WhackAMoleGUI extends JFrame implements Observer {

	private WhackAMoleModel myModel;
	private JButton[][] buttonTable;
	private JLabel scorePanel;

	/**
	 * Construct a new WhackAMoleGUI for the specified model.
	 * 
	 * @param myModel
	 *            the model for this GUI.
	 */
	public WhackAMoleGUI(WhackAMoleModel myModel) {
		super("Whack-A-Mole");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		this.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		this.myModel = myModel;
		myModel.addObserver(this);

		buttonTable = new JButton[4][4];

		/* Add other components */
		mainPanel.add(getScorePanel());
		mainPanel.add(getTable());

		this.pack();
	}


	/**
     * 
     */
	private JPanel getTable() {
		JPanel table = new JPanel();
		table.setLayout(new BoxLayout(table, BoxLayout.Y_AXIS));
		
		/* Create and set icons to the buttons */
		for (int row = 0; row < buttonTable.length; row++) {
			for (int col = 0; col < buttonTable[row].length; col++) {
				buttonTable[row][col] = new JButton();
			}
		}


		/* Create each row of 4 buttons */
		JPanel row1 = new JPanel();
		row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
		for (int col = 0; col < buttonTable[0].length; col++) {
			row1.add(buttonTable[0][col]);
		}

		JPanel row2 = new JPanel();
		row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
		for (int col = 0; col < buttonTable[1].length; col++) {
			row2.add(buttonTable[1][col]);
		}

		JPanel row3 = new JPanel();
		row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
		for (int col = 0; col < buttonTable[2].length; col++) {
			row3.add(buttonTable[2][col]);
		}

		JPanel row4 = new JPanel();
		row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
		for (int col = 0; col < buttonTable[3].length; col++) {
			row4.add(buttonTable[3][col]);
		}

		/* Add each row to the table */
		table.add(row1);
		table.add(row2);
		table.add(row3);
		table.add(row4);

		/* Add Action Listener to each button */
		for (int row = 0; row < buttonTable.length; row++) {
			for (int col = 0; col < buttonTable[row].length; col++) {
				ButtonListener bl = new ButtonListener(row, col);
				buttonTable[row][col].addActionListener(bl);
			}
		}

		/* Set icons */
		setIcons();

		/* Everything is set up. Return the table. */
		return table;
	}

	private void setIcons() {
		/* Add and load icon */

		ImageIcon mole = new ImageIcon(
				WhackAMoleGUI.class.getResource("icons/gopher.jpg"));
		ImageIcon hole = new ImageIcon(
				WhackAMoleGUI.class.getResource("icons/hole.jpg"));

		/* Create and set icons to the buttons, hole and mole accordingly */
		for (int row = 0; row < buttonTable.length; row++) {
			for (int col = 0; col < buttonTable[row].length; col++) {
				buttonTable[row][col].setIcon(hole);
			}
		}

		buttonTable[myModel.getMoleRow()][myModel.getMoleCol()].setIcon(mole);
	}
	
	private class ButtonListener implements ActionListener {
		private int row;
		private int col;

		public ButtonListener(int row, int col) {
			this.row = row;
			this.col = col;
		}

		public void actionPerformed(ActionEvent e) {
			myModel.whack(this.row, this.col);
		}
	}

	private JLabel getScorePanel() {
		scorePanel = new JLabel("Score : " + myModel.getScore());

		return scorePanel;
	}

	/**
	 * Update the GUI to reflect the state of the model. This method repaints
	 * all of the buttons with a hole and then repaints the button with the mole
	 * on it.
	 */
	public void update(Observable o, Object arg) {
		scorePanel.setText("Score: " + myModel.getScore());
		setIcons();
	}

	/**
	 * Run the WhackAMole game.
	 * 
	 * @param args
	 *            none
	 */
	public static void main(String[] args) {
		WhackAMoleModel wamm = new WhackAMoleModel();
		WhackAMoleGUI gui = new WhackAMoleGUI(wamm);
		gui.setVisible(true);
	}
}
