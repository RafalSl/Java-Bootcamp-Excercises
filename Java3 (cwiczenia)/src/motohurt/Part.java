package motohurt;

public class Part {
	private int id;
	private String producent, model;
	int serialNo;
	
	public Part(int id, String producent, String model, int serialNo) {
		this.id = id;
		this.producent = producent;
		this.model = model;
		this.serialNo = serialNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSerialNo() {
		return serialNo;
	}


}
