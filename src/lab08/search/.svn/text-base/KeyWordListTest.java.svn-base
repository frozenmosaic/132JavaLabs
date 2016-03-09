package lab08.search;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class KeyWordListTest {

	private KeyWordList kwl;
	private KeyWord kw1;
	private KeyWord kw2;
	private KeyWord kw3;
	private PageInfo t1;
	private PageInfo t2;
	private PageInfo t3;
	private PageInfo t4;

	@Before
	public void setUp() {
		kwl = new KeyWordList();

		// create keywords, each with its own set of pages
		kw1 = new KeyWord("dickinson");
		t1 = new PageInfo("Dickinson College", "dickinson.edu", 15);
		t2 = new PageInfo("Dickinson Academic", "dickinson.edu/academic", 10);
		kw1.addPage(t1);
		kw1.addPage(t2);

		kw2 = new KeyWord("facebook");
		t3 = new PageInfo("FB Home", "facebook.com", 25);
		t4 = new PageInfo("FB Help", "facebook.com/help", 5);
		kw2.addPage(t3);
		kw2.addPage(t4);

		kw3 = new KeyWord("misc");
		kw3.addPage(t1);
		kw3.addPage(t2);
		kw3.addPage(t3);
		kw3.addPage(t4);

		// add all keywords to keyword list
		kwl.addKeyWord(kw2);
		kwl.addKeyWord(kw1);
		kwl.addKeyWord(kw3);
	}

	@Test
	public void testConstructor1() {
		assertNotNull(kwl.getKeyWords());
	}

	@Test
	public void testConstructor2() throws FileNotFoundException {
		KeyWordList kwl2 = new KeyWordList(
				"src/lab08/search/test.txt");
		assertEquals("wrong size of keyword list", 11, kwl2.getKeyWords().size());
		assertEquals("wrong pages for keyword dickinson", 2, kwl2.getKeyWords().get(0).getPages().size());
	}

	@Test
	public void testSort() {
		kwl.sort();
		assertEquals(3, kwl.getKeyWords().size());
		assertEquals(kw1, kwl.getKeyWords().get(0));
	}

	@Test
	public void testSearch() {
		ArrayList<PageInfo> res = kwl.search("dickinson");
		assertEquals("wrong size", 2, res.size());
		assertEquals(t1, res.get(0));
	}

	@Test
	public void testSearchAll() {
		String[] keys = { "dickinson", "misc" };
		ArrayList<PageInfo> res = kwl.searchAll(keys);
		assertEquals("wrong size", 2, res.size());
		assertEquals("wrong order", t1, res.get(0));
	}

	@Test
	public void testSearchAny() {
		String[] keys = { "dickinson", "misc" };
		ArrayList<PageInfo> res = kwl.searchAny(keys);
		assertEquals("wrong size", 4, res.size());
		assertEquals("wrong order", t3, res.get(0));
		assertEquals("wrong order", t4, res.get(res.size() - 1));
	}
}
