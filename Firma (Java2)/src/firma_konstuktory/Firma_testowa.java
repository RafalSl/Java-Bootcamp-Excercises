package firma_konstuktory;

public class Firma_testowa {

	public static void main(String[] args) {
		Pracownik p1 = new Pracownik("Adam", "Kowalski", 25);
		Pracownik p2 = new Pracownik("Tomasz", "Nowak");
		Pracownik p3 = new Pracownik("Anna");
		
		System.out.println(p1.imie + " " + p1.nazwisko + " " + p1.wiek);
		System.out.println(p2.imie + " " + p2.nazwisko + " " + p2.wiek);
		System.out.println(p3.imie + " " + p3.nazwisko + " " + p3.wiek);
	}

}
