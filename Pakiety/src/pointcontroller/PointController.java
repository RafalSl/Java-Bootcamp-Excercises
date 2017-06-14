package pointcontroller;

import point.Point;

public class PointController {
	public void addX(Point punkt) {
		punkt.setX(punkt.getX() + 1);
	}
	
	public void minusX(Point punkt) {
		punkt.setX(punkt.getX() - 1);
	}
	
	public void addY(Point punkt) {
		punkt.setY(punkt.getY() + 1);
	}
	
	public void minusY(Point punkt) {
		punkt.setY(punkt.getY() - 1);
	}
}
