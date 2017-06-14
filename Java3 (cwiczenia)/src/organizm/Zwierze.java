package organizm;

public class Zwierze extends Organizm {

	@Override
	public void spi(int godziny) {
		System.out.println(getNazwa() + " �pi " + godziny + " godzin.");	
	}
	
	public void poruszaSie() {
		System.out.println(getNazwa() + "przemieszcza si�.");
	}
	
	@Override
	public void spotyka(Organizm org) {
		System.out.println(getNazwa() + " spotyka " + org.getNazwa());
	}
	
	public void wydajeDziwek() {
		System.out.println(getNazwa() + "wydaje dzwi�k.");
	}
	
	public void wydajeDziwek(String dzwiek) {
		System.out.println(getNazwa() + "wydaje" + dzwiek);
	}

}
