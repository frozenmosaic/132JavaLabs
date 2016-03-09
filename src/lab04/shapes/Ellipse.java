package lab04.shapes;

import java.awt.*;

public class Ellipse extends Point implements Scaleable {

	private int axisL;
	private int axisS;

	public Ellipse(int x, int y, Color c, int l, int s) {
		super(x, y, c);
		axisL = l;
		axisS = s;
	}

	public int getLongAxis() {
		return axisL;
	}

	public int getShortAxis() {
		return axisS;
	}

	public void setLongAxis(int newL) {
		axisL = newL;
	}

	public void setShortAxis(int newS) {
		axisS = newS;
	}

	// === Implement Scaleable method ===//
	public void scale(double factor) {
		axisL = (int) (Math.round(axisL * factor));
		axisS = (int) (Math.round(axisS * factor));
	}

	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX() - axisL / 2, getY() - axisS / 2, axisL, axisS);
	}

//	public static void main(String[] args) {
//		DrawableObjectList objList = new DrawableObjectList();
//		DrawingTablet tablet = new DrawingTablet("Line", 100, 100, objList);
//
//		Ellipse e1 = new Ellipse(50, 50, Color.red, 100, 50);
//		objList.addDrawable(e1);
//
//		tablet.repaint();
//	}
}
