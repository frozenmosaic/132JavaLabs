package lab05.whackamole;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class WhackAMoleModelTest {

	private WhackAMoleModel wamm;
	private boolean[][] board = new boolean[4][4];
	private Random rnd = new Random();

	@Test
	public void testConstructor() {
		wamm = new WhackAMoleModel(0, 1);
		assertEquals(0, wamm.getMoleRow());
		assertEquals(1, wamm.getMoleCol());
		assertEquals(0, wamm.getScore());
	}

	@Test
	public void testConstructor2() {
		for (int count=0; count < 10001; count++) {
			wamm = new WhackAMoleModel();
			board[wamm.getMoleRow()][wamm.getMoleCol()] = true;	
	}
		
		boolean correct = true;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (!board[row][col]) {
					correct = false;
				}
			}
		}
		
		assertTrue(correct);
	}

	@Test
	public void testWhack() {
		wamm = new WhackAMoleModel();
		for (int count = 0; count < 10001; count++) {
			wamm.whack(rnd.nextInt(4), rnd.nextInt(4));
			board[wamm.getMoleRow()][wamm.getMoleCol()] = true;
			count++;
		}

		boolean correct = true;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (!board[row][col]) {
					correct = false;
				}
			}
		}

		assertTrue(correct);
	}

	// @Test
	// public void testWhack() {
	// System.out.println("Mole row: " + wamm.getMoleRow() + ", mole col: " +
	// wamm.getMoleCol());
	// wamm.whack(wamm.getMoleRow(), wamm.getMoleCol());
	// System.out.println("Score: " + wamm.getScore());
	// System.out.println("Mole row: " + wamm.getMoleRow() + ", mole col: " +
	// wamm.getMoleCol());
	// }
}
