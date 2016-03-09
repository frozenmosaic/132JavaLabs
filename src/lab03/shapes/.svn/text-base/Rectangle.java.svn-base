package lab03.shapes;

import java.awt.*;

/**
 * A Rectangle is an object representing a rectangle. The left and right 
 * edges of the rectangle are at x and x + width. 
 * The top and bottom edges are at y and y + height. 
 * The rectangle has a specified color
 * @author trana
 *
 */
public class Rectangle implements Drawable {
	private int x; 
	private int y;
	private int width;
	private int height;
	private Color color;
	private boolean isVisible;
	
	public Rectangle(int initX, int initY, int initW, int initH, Color initColor){
		x = initX;
		y = initY;
		width = initW;
		height = initH;
		color = initColor;
		isVisible = true;
		
	}
	/**
     * Get the x coordinate of the top left edge
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the top left edge
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }
    /**
     * Get the width of the rectangle
     * @return the width
     */
    public int getWidth(){
    	return width;
    }
    /**
     * Get the height of the rectangle
     * @return height
     */
    public int getHeight(){
    	return height;
    }
    /**
     * Set the width of the rectangle
     */
    public void setWidth(int width){
    	this.width = width;
    }
    /**
     * Set the height of the rectangle
     */
    public void setHeight(int height){
    	this.height = height;
    }
    
    /**
     * Move the Rectangle to a new location. This method changes the x,y coordinate
     * of the square using the values provided by the parameters.
     * 
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Move the Rectangle relative to its current location. The top left corner of the
     * rectangle is moved by adding the parameters to the Rectangle's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *           Rectangle to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            Rectangle down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    /**
     * Get the Color of this Rectangle
     * 
     * @return the color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Change the color of this Rectangle to the newColor.
     * 
     * @param newColor the new color.
     */
    public void setColor(Color newColor) {
        color = newColor;
    }

    /**
     * Set whether or not this Rectangle will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this Rectangle visible, false to make it
     *            invisible.
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    /**
     * Find out if this Rectangle is visible or not.
     * 
     * @return true if the Rectangle is visible, false if it is not.
     */
    public boolean isVisible() {
        return isVisible;
    }
    /**
     * Draw this DrawableRectangle onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableRectangle.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(x,y,width,height);
    }
	
	
	

}
