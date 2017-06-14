package Firma;

public class Company {

	public static void main(String[] args) {
		Employee prac1 = new Employee();
		Employee prac2 = new Employee();
		Employee prac3 = new Employee();
		
		prac1.imie = "Adam";
		prac1.nazwisko = "Kowalski";
		prac1.rok_ur = "01-01-1900";
		prac1.staz = 60;
		
		prac2.imie = "Anna";
		prac2.nazwisko = "Nowak";
		prac2.rok_ur = "01-01-1990";
		prac2.staz = 5;

		prac3.imie = "Tomasz";
		prac3.nazwisko = "Kruk";
		prac3.rok_ur = "01-05-1968";
		prac3.staz = 30;
		
		System.out.println(prac1.imie + " " + prac1.nazwisko + " urodzony: " + prac1.rok_ur + ", sta¿ pracy: " + prac1.staz);
		System.out.println(prac2.imie + " " + prac2.nazwisko + " urodzony: " + prac2.rok_ur + ", sta¿ pracy: " + prac2.staz);
		System.out.println(prac3.imie + " " + prac3.nazwisko + " urodzony: " + prac3.rok_ur + ", sta¿ pracy: " + prac3.staz);
	}

}
