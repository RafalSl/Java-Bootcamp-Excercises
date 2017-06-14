package organizm;

import bakteria.Bakteria;

public class Test {

	public static void main(String[] args) {
		Bakteria b1 = new Bakteria();
		Organ watroba = new Organ("w¹troba");
		b1.setNazwa("Bakteria Aldona");
		b1.setOrganyValue("W¹troba", watroba);
		b1.je("trupka");
		b1.wydala();
		b1.zaraza();
		b1.spi(5);
	
		
	}

}
