package lab03.shapes;
import java.awt.*;
/**
 * A Square is an object representing a square. The left and right 
 * edges of the square are at x and x + length. 
 * The top and bottom edges are at y and y + length. 
 * The  square has a specified color
 * @author trana
 *
 */
public class Square implements Drawable, Scaleable{
	private int x;
	private int y;
	private int length;
	private Color color;
	private boolean isVisible;
	
	public Square(int initX, int initY, int initLength, Color initColor){
		x = initX;
		y = initY;
		length = initLength;
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
     * Get the length of the square
     * @return height
     */
    public int getLength(){
    	return length;
    }
    /**
     * Set the length of the rectangle
     */
    public void setLength(int length){
    	this.length = length;
    }
    /**
     * Move the Square to a new location. This method changes the x,y coordinate
     * of the Square using the values provided by the parameters.
     * 
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Move the Square relative to its current location. The top left corner of the
     * square is moved by adding the parameters to the Square's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *           Square to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            Square down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    /**
     * Get the Color of this Square
     * 
     * @return the color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Change the color of this Square to the newColor.
     * 
     * @param newColor the new color.
     */
    public void setColor(Color newColor) {
        color = newColor;
    }

    /**
     * Set whether or not this Square will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this Square visible, false to make it
     *            invisible.
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    /**
     * Find out if this Square is visible or not.
     * 
     * @return true if the Square is visible, false if it is not.
     */
    public boolean isVisible() {
        return isVisible;
    }
    /**
     * Draw this DrawableSquare onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableSquare.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(x,y,length,length);
    }
    /**
     * Scale this Square by the specified factor. For example a factor of 2.0
     * will make the length twice as bit and a factor of 0.5 will make it half
     * as large. If the factor is negative the radius is not changed.
     * 
     * @param factor the factor by which this Square is to be scaled.
     */
    public void scale(double factor) {
        if (factor > 0) {
            length = (int) (Math.round(length * factor));
        }
    }
    


}
