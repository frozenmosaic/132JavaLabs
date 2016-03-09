package lab04.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class SquareTest {

	private Square s1 = new Square(50, 50, 25, Color.red);
	
	@Test
	public void testConstructor() {
		assertEquals("wrong x", 50, s1.getX());
		assertEquals("wrong y", 50, s1.getY());
		assertEquals("wrong length", 25, s1.getLength());
		assertEquals("wrong color", Color.red, s1.getColor());
		assertTrue("should be visible", s1.isVisible());
	}


	@Test
	public void testSetWidth() {
		s1.setWidth(20);
		assertEquals("wrong width", 20, s1.getWidth());
		assertEquals("wrong height", 20, s1.getHeight());
	}

	@Test
	public void testSetHeight() {
		s1.setHeight(40);
		assertEquals("wrong height", 40, s1.getHeight());
		assertEquals("wrong width", 40, s1.getWidth());
	}

}
