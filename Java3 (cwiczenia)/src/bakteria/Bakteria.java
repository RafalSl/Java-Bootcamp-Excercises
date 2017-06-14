package bakteria;

import java.util.HashMap;

import organizm.Organ;
import organizm.Organizm;

public class Bakteria extends Organizm {

	@Override
	public void spi(int godziny) {
		System.out.println("Bakteria nigdy nie œpi!!!");
		
	}
	
	@Override
	public void spotyka(Organizm org) {
		// TODO Auto-generated method stub
		
	}
	
	public int zaraza() {
		int kila = 1;
		System.out.println(getNazwa() + " zara¿a ki³¹.");
		return kila;
	}

	public HashMap<String, Organ> getOrgany() {
		System.out.println("Bakteria ma tylko jedn¹ komórkê i nie ma organów");
		return getOrgany();
	}

	public void setOrgany(HashMap<String, Organ> organy) {
		System.out.println("Bakteria ma tylko jedn¹ komórkê i nie ma organów");
	}
	
	public Organ getOrganyValue(String key) {
		System.out.println("Bakteria ma tylko jedn¹ komórkê i nie ma organów");
		return getOrgany().get(key);
	}
	
	public void setOrganyValue(String key, Organ organ) {
		System.out.println("Bakteria ma tylko jedn¹ komórkê i nie ma organów");
	}

}
