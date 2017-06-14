package punkt3D;

public class PointController3D extends PointController2D {
	
	public void addZ(Point3D punkt) {
		punkt.setZ(punkt.getZ() + 1);
	}
	
	public void minusZ(Point3D punkt) {
		punkt.setZ(punkt.getZ() - 1);
	}
}
