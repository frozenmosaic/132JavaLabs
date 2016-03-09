package lab08.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class PageInfoTest {

	private PageInfo test = new PageInfo("Dickinson", "dickinson.edu", 10);
	@Test
	public void testConstructor() {
		assertEquals("wrong title", "Dickinson", test.getTitle());
		assertEquals("wrong url", "dickinson.edu", test.getURL());
		assertEquals("wrong link count", 10, test.getLinkCount());
	}
	
	@Test
	public void testEquals1() {
		PageInfo t1 = new PageInfo("Dickinson College", "dickinson.edu", 15);
		assertTrue(test.equals(t1));
	}
	
	@Test
	public void testEquals2() {
		PageInfo t1 = new PageInfo("Dickinson", "facebook.com", 15);
		assertFalse(test.equals(t1));
	}
	
	@Test
	public void testCompareTo() {
		PageInfo t1 = new PageInfo("Dickinson College", "dickinson.edu", 15);
		assertEquals(-1, test.compareTo(t1));
	}
	
	@Test
	public void testCompareTo2() {
		PageInfo t1 = new PageInfo("Dickinson College", "dickinson.edu", 5);
		assertEquals(1, test.compareTo(t1));
	}
	
	@Test
	public void testCompareTo3() {
		PageInfo t1 = new PageInfo("Dickinson", "dickinson.edu", 10);
		assertEquals(0, test.compareTo(t1));
	}

}
