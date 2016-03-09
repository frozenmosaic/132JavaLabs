package lab04.shapes;

import static org.junit.Assert.*;

import java.awt.*;

import org.junit.Before;
import org.junit.Test;

public class TextTest {

	private Text t1;
	
	@Before
	public void setUp() {
		t1 = new Text(100, 100, "Lab", Color.red);
	}
	
	@Test
	public void constructor() {
		assertEquals("wrong x", 100, t1.getX());
		assertEquals("wrong y", 100, t1.getY());
		assertEquals("wrong text", "Lab", t1.getText());
		assertEquals("wrong color", Color.red, t1.getColor());
	}
	@Test
	public void testSetText() {
		t1.setText("Lab04");
		assertEquals("wrong text", "Lab04", t1.getText());
	}
	
	

}
