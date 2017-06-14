package motohurt;

public class Wheel extends Part {
	private int size, width;
	
	public Wheel(int id, String producent, String model, int serialNo, int size, int width) {
		super(id, producent, model, serialNo);
		this.size = size;
		this.width = width;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
