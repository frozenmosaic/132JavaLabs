package lab05.whackamole;

import java.util.*;

/**
 * A model (in the MVC sense) for a whack-a-mole game. The model keeps track of
 * the location of the mole. It has a method for whacking a location and handles
 * scoring points and moving the mole if it was there and deducting points if
 * the mole was not there.
 * 
 * @author Grant Braught
 * 
 * @author Vy Huynh
 * @version Feb 26, 2015
 */
public class WhackAMoleModel extends Observable {

	private int mRow;
	private int mCol;
	private int score;
	private Random rnd;

	/**
	 * Construct a new 4x4 Whack-a-Mole board. The mole is initially at a
	 * randomly selected location. The score is initially 0.
	 */
	public WhackAMoleModel() {
		rnd = new Random();
		
		mRow = rnd.nextInt(4);
		mCol = rnd.nextInt(4);

		score = 0;

	}
	
	public WhackAMoleModel(int row, int col) {
		mRow = row;
		mCol = col;
		
		rnd = new Random();
		
		score = 0;
	}

	/**
	 * Get the row containing the mole.
	 * 
	 * @return the row containing the mole.
	 */
	public int getMoleRow() {
		return mRow;
	}

	/**
	 * Get the column containing the mole.
	 * 
	 * @return the column containing the mole.
	 */
	public int getMoleCol() {
		return mCol;
	}

	/**
	 * Get the current score.
	 * 
	 * @return the score.
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Whack the hole at the specified row and column. When a hole is whacked
	 * the score is increased if there was a mole at that location and decreased
	 * if there was not. Either way the location of the mole is changed and any
	 * observers are notified of the change.
	 * 
	 * @param row
	 *            the row to whack
	 * @param col
	 *            the column to whack
	 */
	public void whack(int row, int col) {
		if (row == mRow && col == mCol) {
			score = score + 10;
		} else {
			score = score - 10;
		}

		/* Change the location of the mole */
		mRow = rnd.nextInt(4);
		mCol = rnd.nextInt(4);
		
		/* Notify the observer */
		setChanged();
		notifyObservers();

	}
	
//	public static void main(String[] args) {
//		WhackAMoleModel wamm = new WhackAMoleModel();
//		System.out.println(wamm.getMoleRow());
//	}
}
