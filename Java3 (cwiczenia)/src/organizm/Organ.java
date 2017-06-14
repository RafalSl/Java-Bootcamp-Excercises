package organizm;

public class Organ {
	private String nazwa;

	public Organ(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public Organ() {
		this.nazwa = "Nie nazwany organ";
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	
}
