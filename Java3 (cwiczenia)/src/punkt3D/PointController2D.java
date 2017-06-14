package punkt3D;

public class PointController2D {
	public void addX(Point2D punkt) {
		punkt.setX(punkt.getX() + 1);
	}
	
	public void minusX(Point2D punkt) {
		punkt.setX(punkt.getX() - 1);
	}
	
	public void addY(Point2D punkt) {
		punkt.setY(punkt.getY() + 1);
	}
	
	public void minusY(Point2D punkt) {
		punkt.setY(punkt.getY() - 1);
	}
}
