package lab09.list;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class CS132ArrayListTest {

	/*
	 * The myList field can refer to any object that implements the CS132List
	 * interface (e.g. a CS132ArrayList or a CS132LinkedList). In this class it
	 * is set in the setUp method to refer to a CS132ArrayList.
	 * 
	 * If you use CS132List referred to my myList in all of your tests in this
	 * class and also use only the methods in the CS132List interface, then the
	 * CS132SinglyLinkedListTest class that you are given run all of your tests
	 * against your CS132LinkedList class as well. Thus, you will only need to
	 * create one set of tests!
	 * 
	 * Be sure to look at the CS132SinglyLinkedListTest class to see how this
	 * works! Its pretty clever!
	 */
	protected CS132List myList;

	@Before
	public void setUp() throws Exception {
		myList = new CS132ArrayList();
		
	}

	@Test
	public void testSize() {
		assertEquals("wrong size", 0, myList.size());
	}
	
	@Test 
	public void testAdd1() { // not full
		int x1 = 3;
		int x2 = 4;
		
		myList.add(x1);
		myList.add(x2);
		
		assertEquals("wrong size", 2, myList.size());
		assertEquals("wrong element", 3, myList.get(0));
		assertEquals("wrong element", 4, myList.get(1));
	}
	
	@Test
	public void testAdd2() { // full
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		int x5 = 9;
		int x6 = 10;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		myList.add(x5);
		myList.add(x6);
		
		assertEquals(6, myList.size());
		
	}
	
	@Test
	public void testGet1() { // no exception thrown
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		
		assertEquals(7, myList.get(2));
	}
	
	@Test
	public void testGet2() { // test exception being thrown
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		
		try {
			myList.get(5);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		} 
	}
	
	@Test
	public void testSet1() {
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		
		myList.set(3, 9);
		
		assertEquals("wrong size", 4, myList.size());
		assertEquals("wrong element", 9, myList.get(3));
	}
	

	@Test
	public void testSet2() { // test exception being thrown
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		
		try {
			myList.set(5, 9);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		} 
		
		try {
			myList.set(-5, 9);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		} 
	}
	
	@Test
	public void testInsert() { // array not yet full
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		
		myList.insert(3, 6);
		
		assertEquals("wrong size", 5, myList.size());
		assertEquals("wrong element at inserted index", 6, myList.get(3));
		assertEquals("wrong element at end", 8, myList.get(myList.size()-1));
	}
	
	@Test
	public void testInsert2() { // full array
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		int x5 = 9;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		myList.add(x5);
		
		myList.insert(3, 6);
		
		assertEquals("wrong size", 6, myList.size());
		assertEquals("wrong element at inserted index", 6, myList.get(3));
		assertEquals("wrong element at end", 9, myList.get(myList.size()-1));
	}
	
	@Test
	public void testRemove() {
		int x1 = 3;
		int x2 = 4;
		int x3 = 7;
		int x4 = 8;
		
		myList.add(x1);
		myList.add(x2);
		myList.add(x3);
		myList.add(x4);
		
		assertEquals("wrong element removed", 7, myList.remove(2));
		assertEquals("wrong size", 3, myList.size());
		assertEquals("wrong element at end", 8, myList.get(myList.size()-1));
	}
	
}
