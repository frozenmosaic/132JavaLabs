package lab04.shapes;

import java.awt.*;

import lab04.shapes.DrawableObjectList;
import lab04.shapes.DrawingTablet;

public class Picture {

	public static void main(String[] args) {
		/*
		 * Create a DrawableObject list and use it to create a DrawingTablet.
		 */
		DrawableObjectList objList = new DrawableObjectList();
		DrawingTablet tablet = new DrawingTablet("Picture", 300, 300, objList);
		
		/*
		 * Create the elements of the picture with a sun, a cloud, a house with a roof on top, a line as
		 * the horizon, and the name of the house.
		 */
		Circle sun = new Circle(200,40,40,Color.red);
		
		Ellipse cloud = new Ellipse(100,40,Color.cyan,70,20);
		
		Rectangle roof = new Rectangle(175,130,Color.MAGENTA,100,20);
		
		Square house = new Square(200,150,50,Color.orange);
		
		Text text = new Text(50,50,"Anh's house",Color.black);
		
		Line line = new Line(0,200,300,200,Color.gray);
		
		/*
		 * Add these elements to the DrawingTablet
		 */
		objList.addDrawable(sun);
		objList.addDrawable(cloud);
		objList.addDrawable(roof);
		objList.addDrawable(house);
		objList.addDrawable(line);
		objList.addDrawable(text);
		
		/*
		 * Draw the picture.
		 */
		tablet.repaint();	
	}
}
