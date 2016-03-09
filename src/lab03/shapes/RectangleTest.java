package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class RectangleTest {
	private Rectangle r1 = new Rectangle(50, 50, 25, 50, Color.gray);

	@Test
	public void testConstructor() {
		assertEquals("wrong x", 50, r1.getX());
		assertEquals("wrong y", 50, r1.getY());
		assertEquals("wrong width", 25, r1.getWidth());
		assertEquals("wrong height", 50, r1.getHeight());
		assertEquals("wrong color", Color.gray, r1.getColor());
		assertTrue("should be visible", r1.isVisible());
	}
	@Test
	public void testSetColor(){
		r1.setColor(Color.red);
		assertEquals(Color.red, r1.getColor());
	}
	
	@Test
	public void testSetVisible(){
		r1.setVisible(false);
		assertFalse("should be invisible", r1.isVisible());
		r1.setVisible(true);
		assertTrue("should be visible", r1.isVisible());
	}
	@Test
	public void testSetWidth(){
		r1.setWidth(20);
		assertEquals("wrong width",20, r1.getWidth());
	}
	@Test
	public void testSetHeight(){
		r1.setHeight(40);
		assertEquals("wrong height",40, r1.getHeight());
	}
	@Test
	public void testMove(){
		r1.move(20,20);
		assertEquals("wrong x", 20, r1.getX());
		assertEquals("wrong y", 20, r1.getY());
	}
	@Test
	public void testTranslate(){
		r1.translate(-10, -5);
		assertEquals("wrong x", 40, r1.getX());
		assertEquals("wrong y", 45, r1.getY());
	}
	
	

}
