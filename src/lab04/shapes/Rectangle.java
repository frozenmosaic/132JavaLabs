package lab04.shapes;

import java.awt.*;

/**
 * Representation of the Rectangle. The Rectangle has (x,y) as the coordinates
 * of the top left corner. The color of the point is the color of the Rectangle.
 * 
 * @author trana
 * @author huynhv
 * @version Feb 19, 2015
 * 
 */
public class Rectangle extends Point implements Scaleable {

	private int width;
	private int height;

	/**
	 * Construct a new Rectangle
	 * 
	 * @param x
	 *            x-coordinate of the top left corner
	 * @param y
	 *            y-coordinate of the top left corner
	 * @param c
	 *            color of the rectangle
	 * @param width
	 *            width of the rectangle
	 * @param height
	 *            height of the rectangle
	 */
	public Rectangle(int x, int y, Color c, int width, int height) {
		super(x, y, c);
		this.width = width;
		this.height = height;
	}

	/**
	 * Return the width
	 * 
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Return the height
	 * 
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Set new width
	 * 
	 * @param newW
	 *            new width
	 */
	public void setWidth(int newW) {
		width = newW;
	}

	/**
	 * Set new height
	 * 
	 * @param newH
	 *            new height
	 */
	public void setHeight(int newH) {
		height = newH;
	}

	/**
	 * Draw the Rectangle on the graphics context.
	 * 
	 * @param g
	 *            the Graphics context on which to draw the Point.
	 */
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX(), getY(), width, height);
	}

	// === Implements Scaleable method ===//
	/**
	 * Scale this object by the the specified factor. For example a factor of
	 * 2.0 will make the object twice as bit and a factor of 0.5 will make it
	 * half as large. If the factor is negative the object is not changed. If
	 * new width or height is a decimal number, the decimal part will be
	 * eliminated.
	 * 
	 * @param factor
	 *            the factor by which the object should be scaled.
	 */
	public void scale(double factor) {
		if (factor > 0) {
			width = (int) (Math.round((width * factor)));
			height = (int) (Math.round((height * factor)));
		}
	}

	// public static void main(String[] args) {
	// DrawableObjectList objList = new DrawableObjectList();
	// DrawingTablet tablet = new DrawingTablet("Line", 100, 100, objList);
	//
	// Rectangle r1 = new Rectangle(50, 50, Color.red, 10, 50);
	// objList.addDrawable(r1);
	//
	// tablet.repaint();
	// }

}
