package lab04.shapes;

import java.awt.*;

/**
 * Representation of the Text. The text has (x,y) as the coordinates of 
 * the baseline leftmost point. The color of the point is the color of 
 * the text. The content of the text is a String.
 * 
 * @author trana
 * @author huynhv
 * @version Feb 19, 2015
 * 
 */
public class Text extends Point {
	private String text;

	/**
	 * Construct a new Text.
	 * 
	 * @param x
	 *            x-coordinate of the baseline leftmost point
	 * @param y
	 *            y-coordinate of the baseline leftmost point
	 * @param text
	 *            content of the text
	 * @param color
	 *            color of the text
	 */
	public Text(int x, int y, String text, Color color) {
		super(x, y, color);
		this.text = text;
	}

	/**
	 * Return the text
	 * 
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Set the content of the text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
     * Write the Text on the graphics context.
     * 
     * @param g the Graphics context on which to draw the Point.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawString(text, getX(), getY());
    }
    
//    public static void main(String[] args) {
//    	DrawableObjectList objList = new DrawableObjectList();
//        DrawingTablet tablet = new DrawingTablet("Line", 100, 100, objList);
//
//    	Text t1 = new Text(50, 50, "Anh", Color.red);
//    	objList.addDrawable(t1);
//    	
//    	tablet.repaint();
//    }
}
