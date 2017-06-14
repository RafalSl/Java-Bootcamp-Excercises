package organizm;

public class Zwierze extends Organizm {

	@Override
	public void spi(int godziny) {
		System.out.println(getNazwa() + " œpi " + godziny + " godzin.");	
	}
	
	public void poruszaSie() {
		System.out.println(getNazwa() + "przemieszcza siê.");
	}
	
	@Override
	public void spotyka(Organizm org) {
		System.out.println(getNazwa() + " spotyka " + org.getNazwa());
	}
	
	public void wydajeDziwek() {
		System.out.println(getNazwa() + "wydaje dzwiêk.");
	}
	
	public void wydajeDziwek(String dzwiek) {
		System.out.println(getNazwa() + "wydaje" + dzwiek);
	}

}
