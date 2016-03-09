package lab04.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import lab04.shapes.Rectangle;

import org.junit.Test;

public class RectangleTest {

	private Rectangle r1 = new Rectangle(50, 50, Color.red, 50, 25);

	@Test
	public void testConstructor() {
		assertEquals("wrong x", 50, r1.getX());
		assertEquals("wrong y", 50, r1.getY());
		assertEquals("wrong width", 50, r1.getWidth());
		assertEquals("wrong height", 25, r1.getHeight());
		assertEquals("wrong color", Color.red, r1.getColor());
		assertTrue("should be visible", r1.isVisible());
	}

	@Test
	public void testSetWidth() {
		r1.setWidth(20);
		assertEquals("wrong width", 20, r1.getWidth());
	}

	@Test
	public void testSetHeight() {
		r1.setHeight(40);
		assertEquals("wrong height", 40, r1.getHeight());
	}
	
	@Test
	public void testScale() {
		r1.scale(0.2);
		assertEquals("wrong width", 10, r1.getWidth());
		assertEquals("wrong height", 5, r1.getHeight());
	}

}
