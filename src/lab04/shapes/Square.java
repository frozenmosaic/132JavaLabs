package lab04.shapes;

import java.awt.*;

/**
 * Representation of the Square. The Square has (x,y) as the coordinates of the
 * top left corner. The color of the point is the color of the Square.
 * 
 * @author trana
 * @author huynhv
 * @version Feb 19, 2015
 * 
 */

public class Square extends Rectangle {

	/**
	 * Create a Square object.
	 * @param x x-coordinate of top left corner
	 * @param y y-coordinate of top left corner
	 * @param length length of Square's side
	 * @param color color of the Square
	 */
	public Square(int x, int y, int length, Color color) {
		super(x, y, color, length, length);
	}

	/**
	 * Return the length of the Square
	 */
	public int getLength() {
		return getWidth();
	}

	/**
	 * Set the length of the square
	 */
	public void setWidth(int newW) {
		super.setWidth(newW);
		super.setHeight(newW);
	}

	/**
	 * Set the length of the square
	 */
	public void setHeight(int newH) {
		super.setWidth(newH);
		super.setHeight(newH);
	}

	// public static void main(String[] args) {
	// DrawableObjectList objList = new DrawableObjectList();
	// DrawingTablet tablet = new DrawingTablet("Square", 100, 100, objList);
	//
	// Square s1 = new Square(50, 50, 25, Color.red);
	// objList.addDrawable(s1);
	//
	// tablet.repaint();
	// }
}
