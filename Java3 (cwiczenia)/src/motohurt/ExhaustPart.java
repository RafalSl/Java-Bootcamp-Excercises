package motohurt;

public class ExhaustPart extends Part {
	private boolean euroNorm;
	
	public ExhaustPart(int id, String producent, String model, int serialNo, boolean euroNorm) {
		super(id, producent, model, serialNo);
		this.euroNorm = euroNorm;
	}
	
	public boolean isEuroNorm() {
		return euroNorm;
	}

	public void setEuroNorm(boolean euroNorm) {
		this.euroNorm = euroNorm;
	}	
}
