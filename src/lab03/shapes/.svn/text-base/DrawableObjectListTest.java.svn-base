package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;


import org.junit.Test;

public class DrawableObjectListTest {
	private DrawableObjectList objList = new DrawableObjectList();
	private Drawable obj1 = new Circle(100,100,50,Color.red);
	private Drawable obj2 = new Circle(100,100,25,Color.pink);
	private Drawable obj3 = new Circle(100,100,15,Color.black);

	@Test
	public void testConstructor() {
		assertEquals(0, objList.getSize());
	}
	@Test
	public void testAddObj(){
		objList.addDrawable(obj1);
		objList.addDrawable(obj2);
		objList.addDrawable(obj3);
		assertEquals(3, objList.getSize());
		assertEquals(Color.red, obj1.getColor());
		assertEquals(Color.black, obj3.getColor());
	}
	@Test
	public void testRemoveObj(){
		objList.addDrawable(obj1);
		objList.addDrawable(obj2);
		objList.addDrawable(obj3);
		objList.removeDrawable(obj3);
		assertEquals(2, objList.getSize());
		assertEquals(Color.red, obj1.getColor());
		assertEquals(Color.pink, obj2.getColor());
		
		
	}
	@Test
	public void scaleAll(){
		objList.addDrawable(obj1);
		objList.addDrawable(obj2);
		objList.addDrawable(obj3);
		objList.scaleAll(0.5);
		assertEquals(25, ((Circle) obj1).getRadius());
		assertEquals(13, ((Circle) obj2).getRadius());
		assertEquals(8, ((Circle) obj3).getRadius());
		
		
	}

}
