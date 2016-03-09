package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class SquareTest {
	private Square s1 = new Square(50, 50, 25, Color.cyan);

	@Test
	public void testConstructor() {
		assertEquals("wrong x", 50, s1.getX());
		assertEquals("wrong y", 50, s1.getY());
		assertEquals("wrong length", 25, s1.getLength());
		assertEquals("wrong color", Color.cyan, s1.getColor());
		assertTrue("should be visible", s1.isVisible());
	}

	@Test
	public void testSetColor() {
		s1.setColor(Color.red);
		assertEquals(Color.red, s1.getColor());
	}

	@Test
	public void testSetVisible() {
		s1.setVisible(false);
		assertFalse("should be invisible", s1.isVisible());
		s1.setVisible(true);
		assertTrue("should be visible", s1.isVisible());
	}

	@Test
	public void testSetLength() {
		s1.setLength(40);
		assertEquals("wrong length", 40, s1.getLength());
	}

	@Test
	public void testMove() {
		s1.move(20, 20);
		assertEquals("wrong x", 20, s1.getX());
		assertEquals("wrong y", 20, s1.getY());
	}

	@Test
	public void testTranslate() {
		s1.translate(-10, -5);
		assertEquals("wrong x", 40, s1.getX());
		assertEquals("wrong y", 45, s1.getY());
	}

	@Test
	public void testScale() {
		s1.scale(3.0);
		assertEquals("wrong length", 75, s1.getLength());
		s1.scale(0.2);
		assertEquals("wrong length", 15, s1.getLength());
		s1.scale(-1.5);
		assertEquals("wrong length", 15, s1.getLength());

	}

}
