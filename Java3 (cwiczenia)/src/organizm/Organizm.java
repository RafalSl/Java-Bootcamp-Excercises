package organizm;

import java.util.HashMap;

public abstract class Organizm {
	private HashMap<String, Organ> organy = new HashMap<>();
	private String nazwa;
	
	public void je(String pokarm) {
		System.out.println(nazwa + " je " + pokarm);
	}
	
	public String wydala() {
		System.out.println(nazwa + " wydala.");
		String kupa = null;
		return kupa;
	}
	
	public abstract void spi(int godziny);
	
	public abstract void spotyka(Organizm org);
	
	public void umiera() {
		System.out.println(nazwa + " nie ¿yje."); 
	}
	

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public HashMap<String, Organ> getOrgany() {
		return organy;
	}

	public void setOrgany(HashMap<String, Organ> organy) {
		this.organy = organy;
	}
	
	public Organ getOrganyValue(String key) {
		return organy.get(key);
	}
	
	public void setOrganyValue(String key, Organ organ) {
		this.organy.put(key, organ);
	}
}
