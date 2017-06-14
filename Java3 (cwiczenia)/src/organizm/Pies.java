package organizm;

import bakteria.Bakteria;

public class Pies extends Zwierze {
	
	public void poluje(String ofiara) {
		System.out.println(getNazwa() + " poluje na " + ofiara);
	}
	
	public void spotyka(Organizm org) {
		super.spotyka(org);
		if (org instanceof Bakteria) {
			((Bakteria) org).zaraza();
		}
	}
	
	public void poruszaSie() {
		System.out.println(getNazwa() + " przemieszcza siê na czterech ³apach.");
	}
}
