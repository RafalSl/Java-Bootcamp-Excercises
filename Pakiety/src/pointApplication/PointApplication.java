package pointApplication;

import point.Point;
import pointcontroller.PointController;

public class PointApplication {
	public static void main(String[] args) {
	
	Point punkt = new Point(1, 1);
	PointController controller = new PointController();
	System.out.println(punkt.getX() + " " + punkt.getY());
	controller.addX(punkt);
	controller.addX(punkt);
	controller.minusY(punkt);
	System.out.println(punkt.getX() + " " + punkt.getY());
	}
}
