package punkt3D;

public class Point3D extends Point2D {
	private int z;
	
	public Point3D() {
		setX(0);
		setY(0);
		this.z = 0;
	}
	
	public Point3D(int x, int y, int z) {
		setX(x);
		setY(y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
}
