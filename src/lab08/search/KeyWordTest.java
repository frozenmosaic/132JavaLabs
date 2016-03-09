package lab08.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeyWordTest {

	private KeyWord kw = new KeyWord("dickinson");
	
	@Test
	public void testConstructor() {
		assertEquals("wrong keyword", "dickinson", kw.getWord());
		assertEquals("should have no pages yet", 0, kw.getPages().size());
	}
	
	@Test
	public void testAddPage() {
		PageInfo t1 = new PageInfo("Dickinson College", "dickinson.edu", 15);
		kw.addPage(t1);
		assertEquals("should have Dickinson College page", 1, kw.getPages().size());
	}
	
	@Test
	public void testAddPage2() {
		PageInfo t1 = new PageInfo("Dickinson College", "dickinson.edu", 15);
		PageInfo t2 = new PageInfo("Dickinson", "dickinson.edu", 10);
		kw.addPage(t1);
		kw.addPage(t2);
	}
	
	@Test
	public void testCompare1() {
		KeyWord kw2 = new KeyWord("sustainable");
		assertEquals(1, kw.compareTo(kw2));
	}
	
	@Test
	public void testCompare2() {
		KeyWord kw2 = new KeyWord("alumni");
		assertEquals(-1, kw.compareTo(kw2));
	}
	
	@Test
	public void testCompare3() {
		KeyWord kw2 = new KeyWord("Dickinson");
		assertEquals(-1, kw.compareTo(kw2));
	}
	
	@Test
	public void testCompare4() {
		KeyWord kw2 = new KeyWord("dickinson");
		assertEquals(1, kw.compareTo(kw2));
	}




}
