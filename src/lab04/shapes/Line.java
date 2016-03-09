package lab04.shapes;

import java.awt.*;

/**
 * Representation of a Line. A Line is drawn from two Point objects. This class
 * inherits Point class. shapes in this lab.
 * 
 * @author trana
 * @author huynhv
 * @version Feb 19, 2015
 * 
 */

public class Line extends Point implements Drawable {
	private int x2;
	private int y2;

	/**
	 * Constructor of a Line.
	 * 
	 * @param x
	 *            x-coordinate of the first point
	 * @param y
	 *            y-coordinate of the first point
	 * @param x2
	 *            x-coordinate of the second point
	 * @param y2
	 *            y-coordinate of the second point
	 * @param c
	 *            color of the two points
	 */
	public Line(int x, int y, int x2, int y2, Color c) {
		super(x, y, c);
		this.x2 = x2;
		this.y2 = y2;
	}

	/**
	 * Get x-coordinate of the second point
	 * 
	 * @return the x coordinate
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Get y-coordinate of the second point
	 * 
	 * @return the y coordinate
	 */

	public int getY2() {
		return y2;
	}

	/**
	 * Move the line to a new position
	 * 
	 * @param newX
	 *            new x-coordinate of the first point
	 * @param newY
	 *            new y-coordinate of the first point
	 */
	public void move(int newX, int newY) {
		x2 = x2 + (newX - getX());
		y2 = y2 + (newY - getY());
		super.move(newX, newY);
	}

	/**
	 * Move the Line relative to its current location. The location of the
	 * Line is moved by adding the parameters to the Line's two Points.
	 * 
	 * @param deltaX
	 *            the change in the x coordinate of both Points. Positive values move the Points
	 *            to the right, negative values move it to the left.
	 * @param deltaY
	 *            the change in the y coordinate of both Points. Positive values move the Points
	 *            down, negative values move it up.
	 */
	public void translate(int deltaX, int deltaY) {
		super.translate(deltaX, deltaY);
		x2 = x2 + deltaX;
		y2 = y2 + deltaY;
	}
	
	/**
     * Draw the Point on the graphics context.
     * 
     * @param g the Graphics context on which to draw the Point.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
    	g.drawLine(getX(),getY(),x2,y2);
    }
    
//    public static void main(String[] args) {
//    	DrawableObjectList objList = new DrawableObjectList();
//        DrawingTablet tablet = new DrawingTablet("Line", 10, 10, objList);
//
//    	Line l1 = new Line(1,1,2,1, Color.red);
//    	objList.addDrawable(l1);
//    	
//    	tablet.repaint();
//    }

}
