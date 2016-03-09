package lab04.shapes;

import java.awt.*;

public class Circle extends Ellipse {

	public Circle(int x, int y, int radius, Color c) {
		super(x, y, c, radius, radius);
	}

	public int getRadius() {
		return getLongAxis();
	}

	public void setLongAxis(int newL) {
		super.setLongAxis(newL);
		super.setShortAxis(newL);
	}

	public void setShortAxis(int newL) {
		super.setLongAxis(newL);
		super.setShortAxis(newL);
	}

	public static void main(String[] args) {
		DrawableObjectList objList = new DrawableObjectList();
		DrawingTablet tablet = new DrawingTablet("Line", 100, 100, objList);

		Circle c1 = new Circle(50, 50, 50, Color.red);
		objList.addDrawable(c1);

		tablet.repaint();
	}
}
