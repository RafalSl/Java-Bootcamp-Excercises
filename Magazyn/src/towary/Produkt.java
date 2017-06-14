package towary;

public class Produkt {
	private String nazwa;
	private float cena;
	private int kod;
	
	public Produkt() {
		this.nazwa = "Brak nazwy";
		this.cena = 0;
	}
	
	public Produkt(String nazwa, int kod, float cena) {
		this.nazwa = nazwa;
		this.cena = cena;
		this.kod = kod;
	}
	
	public Produkt(String nazwa, float cena) {
		this.nazwa = "Brak nazwy";
		this.cena = cena;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public float getCena() {
		return cena;
	}
	public void setCena(float cena) {
		this.cena = cena;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}


}
