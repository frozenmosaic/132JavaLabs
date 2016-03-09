package lab03.shapes;

import java.awt.Color;

/**
 * Draw a car from the existing shapes: circle, rectangle and square. The wheels
 * are brown; the windows are pink, the car body is yellow
 * 
 * @author trana and huynhv
 * @version 02/2015
 */

public class Car {
	/**
	 * Draw a yellow car with pink windows and brown wheels in the center of the
	 * window.
	 * 
	 * @param args
	 *            none
	 */
	public static void main(String[] args) {
		/*
		 * Create a DrawableObject list and use it to create a DrawingTablet.
		 */
		DrawableObjectList objList = new DrawableObjectList();
		DrawingTablet tablet = new DrawingTablet("Car", 300, 300, objList);
	
		/*
		 * Create two wheels under the car body
		 */
		Circle wh1 = new Circle(100,175,10,Color.black);
		objList.addDrawable(wh1);
		Circle wh2 = new Circle(200,175,10,Color.black);
		objList.addDrawable(wh2);
		
		/*
		 * Create two square windows in the car body
		 */
		Square w1 = new Square(105,140,20,Color.cyan);
		objList.addDrawable(w1);
		Square w2 = new Square(175,140,20,Color.cyan);
		objList.addDrawable(w2);
		
		/*
		 * Create a rectangle in the center of the screen
		 */
		Rectangle body = new Rectangle(100,125,100,50,Color.blue);
		objList.addDrawable(body);
		
		
		/*
		 * Draw Car
		 */
		tablet.repaint();
		
	}
		
		
}
