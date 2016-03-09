package lab02.minesweeper;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class MineSweeperBoardTest {

	private MineSweeperBoard b1;

	@Before
	public void setUp() throws Exception {
		/*
		 * Construct all of the objects being used in the test fixture here.
		 */
		b1 = new MineSweeperBoard();
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Not yet implemented", 3, b1.getRows());
		assertEquals("Not yet implemented", 4, b1.getColumns());
		assertEquals("Not yet implemented", 2, b1.getNumMines());
		assertEquals("Not yet implemented", MineSweeperBoard.MINE, b1.getCell(0,0));
		assertEquals("Not yet implemented", MineSweeperBoard.MINE, b1.getCell(2,1));
	}

	@Test
	public void testNumAdjMines() {
	    assertEquals("mines not found", 2, b1.numAdjMines(1,0));
	    assertEquals("mines not found", 1, b1.numAdjMines(2,0));
	    assertEquals("mines not found", 2, b1.numAdjMines(1,1));
	    assertEquals("mines not found", 0, b1.numAdjMines(0,3));
	    assertEquals("mines not found", 0, b1.numAdjMines(2,3));
	    assertEquals("mines not found", 1, b1.numAdjMines(1,2));
	} 
	
	@Test
	public void testFlag() {
	    b1.flagCell(2,1);
	    b1.flagCell(1,0);
	    b1.flagCell(0,0);
	    b1.flagCell(0,0);
	    b1.flagCell(2,2);
	    b1.flagCell(2,2);
	    assertEquals("mines flagged incorrectly", MineSweeperBoard.FLAGGED_MINE, b1.getCell(2,1));
	    assertEquals("mines flagged incorrectly", MineSweeperBoard.FLAG, b1.getCell(1,0));
	    assertEquals("mines flagged incorrectly", MineSweeperBoard.MINE, b1.getCell(0,0));
	    assertEquals("mines flagged incorrectly", MineSweeperBoard.COVERED_CELL, b1.getCell(2,2));
	} 
	
	@Test
	public void testUncover() {
	    b1.flagCell(2,1);
	    b1.flagCell(1,0);
	    b1.uncoverCell(2, 1);
	    b1.uncoverCell(1,0);
	    b1.uncoverCell(1,1);
	    b1.uncoverCell(0,0);
		assertEquals("mines uncovered incorrectly", MineSweeperBoard.FLAGGED_MINE, b1.getCell(2,1));
		assertEquals("mines uncovered incorrectly", MineSweeperBoard.FLAG, b1.getCell(1,0));
		assertEquals("mines uncovered incorrectly", MineSweeperBoard.FLAG, b1.getCell(1,0));
		assertEquals("mines uncovered incorrectly", 2, b1.getCell(1,1));
		assertEquals("mines uncovered incorrectly", MineSweeperBoard.UNCOVERED_MINE, b1.getCell(0,0));
	} 
	
	@Test
	public void testReveal() {
	    b1.revealBoard();
		assertEquals("board not revealed properly", MineSweeperBoard.UNCOVERED_MINE, b1.getCell(0,0));
		assertEquals("board not revealed properly", 0, b1.getCell(0,1));
		assertEquals("board not revealed properly", 0, b1.getCell(0,2));
		assertEquals("board not revealed properly", 0, b1.getCell(0,3));
		assertEquals("board not revealed properly", 1, b1.getCell(1,0));
		assertEquals("board not revealed properly", 1, b1.getCell(1,1));
		assertEquals("board not revealed properly", 1, b1.getCell(1,2));
		assertEquals("board not revealed properly", 0, b1.getCell(1,3));
		assertEquals("board not revealed properly", 1, b1.getCell(2,0));
		assertEquals("board not revealed properly", MineSweeperBoard.UNCOVERED_MINE, b1.getCell(2,1));
		assertEquals("board not revealed properly", 0, b1.getCell(2,2));
		assertEquals("board not revealed properly", 0, b1.getCell(2,3));
	} 
	
	@Test
	public void testLost() {
	    b1.uncoverCell(0, 0);
		assertTrue("Did not lose game", b1.gameLost());
	} 
	
	@Test
	public void testLost2() {
		assertFalse("Lost game", b1.gameLost());
	} 
	
	@Test
	public void testWon1() {
		b1.flagCell(0, 0);
		b1.flagCell(2, 1);
		b1.uncoverCell(0, 1);
		b1.uncoverCell(0, 2);
		b1.uncoverCell(0, 3);
		b1.uncoverCell(1, 0);
		b1.uncoverCell(1, 1);
		b1.uncoverCell(1, 2);
		b1.uncoverCell(1, 3);
		b1.uncoverCell(2, 0);
		b1.uncoverCell(2, 1);
		b1.uncoverCell(2, 2);
		b1.uncoverCell(2, 3);
	    assertTrue("Lost game", b1.gameWon());
	} 
	@Test
	public void testWon2() {
		b1.flagCell(0, 0);
		b1.flagCell(2, 1);
		b1.uncoverCell(0, 1);
		b1.uncoverCell(0, 2);
		b1.uncoverCell(0, 3);
		b1.uncoverCell(1, 0);
		b1.uncoverCell(1, 1);
		b1.uncoverCell(1, 2);
		b1.uncoverCell(1, 3);
		b1.uncoverCell(2, 0);
		b1.uncoverCell(2, 1);
		b1.uncoverCell(2, 2);
		assertFalse("Won game", b1.gameLost());
	} 
	
	@Test
	public void testWon3() {
		b1.flagCell(0, 0);
		b1.uncoverCell(0, 1);
		b1.uncoverCell(0, 2);
		b1.uncoverCell(0, 3);
		assertFalse("Won game", b1.gameLost());
	} 
	@Test
	public void testConstructor2() {
		MineSweeperBoard b2 = new MineSweeperBoard(2);
		assertEquals("Not yet implemented", 10, b2.getRows());
		assertEquals("Not yet implemented", 15, b2.getColumns());
		assertEquals("Not yet implemented", 15, b2.getNumMines());
	}
	
	@Test
	public void testConstructor3() {
		MineSweeperBoard b2 = new MineSweeperBoard(3);
		assertEquals("Not yet implemented", 15, b2.getRows());
		assertEquals("Not yet implemented", 20, b2.getColumns());
		assertEquals("Not yet implemented", 45, b2.getNumMines());
	}
	
	@Test
	public void testConstructor4() {
		MineSweeperBoard b2 = new MineSweeperBoard(5);
		assertEquals("Not yet implemented", 5, b2.getRows());
		assertEquals("Not yet implemented", 10, b2.getColumns());
		assertEquals("Not yet implemented", 3, b2.getNumMines());
	}
}
