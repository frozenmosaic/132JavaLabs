package lab04.shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class EllipseTest {

	private Ellipse e1 = new Ellipse(50, 50, Color.red, 50, 20);

	@Test
	public void testConstructor() {
		assertEquals("wrong x", 50, e1.getX());
		assertEquals("wrong y", 50, e1.getY());
		assertEquals("wrong color", Color.red, e1.getColor());
		assertEquals("wrong axisL", 50, e1.getLongAxis());
		assertEquals("wrong axisS", 20, e1.getShortAxis());
	}

	@Test
	public void testSetLongAxis() {
		e1.setLongAxis(100);
		assertEquals("wrong axisL", 100, e1.getLongAxis());
	}
	@Test
	public void testSetShortAxis(){
		e1.setShortAxis(60);
		assertEquals("wrong axisS", 60, e1.getShortAxis());
	}
	@Test
	public void testScale(){
		e1.scale(0.5);
		assertEquals("wrong axisL", 25, e1.getLongAxis());
		assertEquals("wrong axisS", 10, e1.getShortAxis());
		
	}

}
