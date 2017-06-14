package punkt3D;


public class PointApplication {
	public static void main(String[] args) {
	
	Point2D punkt2d = new Point2D(1, 1);
	Point3D punkt3d = new Point3D();
	PointController2D controller2d = new PointController2D();
	PointController3D controller3d = new PointController3D();
	System.out.println("Punkt2d:\n" + punkt2d.getX() + " " + punkt2d.getY());
	controller2d.addX(punkt2d);
	controller2d.addX(punkt2d);
	controller2d.minusY(punkt2d);
	System.out.println(punkt2d.getX() + " " + punkt2d.getY());
	
	System.out.println("Punkt3d:\n" + punkt3d.getX() + " " + punkt3d.getY() + " " + punkt3d.getZ());
	controller3d.addX(punkt3d);
	controller3d.addY(punkt3d);
	controller3d.minusZ(punkt3d);
	System.out.println(punkt3d.getX() + " " + punkt3d.getY() + " " + punkt3d.getZ());
	}
}
