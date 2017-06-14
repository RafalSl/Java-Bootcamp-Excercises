package firma_konstuktory;

public class Pracownik {
	String imie;
	String nazwisko;
	int wiek;

	Pracownik (String imie, String nazwisko, int wiek) {
		this(imie, nazwisko);
		this.wiek = wiek;		
	}
	
	Pracownik (String imie, String nazwisko) {
		this(imie);
		this.nazwisko = nazwisko;	
	}
	
	Pracownik (String imie) {
		this.imie = imie;
		this.nazwisko = "nieznane";
		this.wiek = 0;		
	}
}
