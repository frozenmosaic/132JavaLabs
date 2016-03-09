package lab04.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class LineTest {

	private Line l1;

	@Before
	public void setUp() throws Exception {
		l1 = new Line(1, 1, 2, 1, Color.red);
	}

	@Test
	public void testConstructor() {
		assertEquals("wrong x", 1, l1.getX());
		assertEquals("wrong y", 1, l1.getY());
		assertEquals("wrong x2", 2, l1.getX2());
		assertEquals("wrong y2", 1, l1.getY2());
		assertEquals("wrong color", Color.red, l1.getColor());
		assertTrue("should be visible", l1.isVisible());

	}

	@Test
	public void testGetX2() {
		assertEquals("wrong x2", 2, l1.getX2());
	}

	@Test
	public void testGetY2() {
		assertEquals("wrong y2", 1, l1.getY2());
	}

	@Test
	public void testMove() {
		l1.move(3, 4);
		assertEquals("wrong x", 3, l1.getX());
		assertEquals("wrong y", 4, l1.getY());
		assertEquals("wrong x2", 4, l1.getX2());
		assertEquals("wrong y2", 4, l1.getY2());
	}
	
	@Test
	public void testTranslate() {
		l1.translate(2, 3);
		assertEquals("wrong x", 3, l1.getX());
		assertEquals("wrong y", 4, l1.getY());
		assertEquals("wrong x2", 4, l1.getX2());
		assertEquals("wrong y2", 4, l1.getY2());
	}

}
