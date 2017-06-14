package controller;
import java.util.Scanner;

import magazyn.Magazyn;

public class Controller {
	static Scanner rl = new Scanner(System.in);
	private static String nazwa, wybor;
	private static int kod, liczba;
	private static float cena;

	public static void main(String[] args) {
		boolean out = false;
		Magazyn magazyn = new Magazyn();
		do {
			System.out.print("2. Sprawdz cen�\n3. Dodaj produkt\nq. Wyj�cie z programu.");
			wybor = rl.nextLine();
			switch (wybor) {
			case "2":
				break;
			case "3":
				okreslProdukt();
				if (magazyn.sprawdzRejestr(kod)) {
					System.out.println("Produkt " + nazwa + " (kod: " + kod + ") jest ju� w bazie. Co chcesz zrobi�?");
					System.out.println("Do zaimplementowania opcje update towaru lub wpisanie innego towaru");
				}
				magazyn.dodajProdukt(nazwa, kod, cena);
				magazyn.updateStan(kod, liczba);
				System.out.print("Dodano produkt: "); 
				magazyn.pokazProdukt(kod);
				break;
			case "q":
				out = true;
				break;
			default: System.out.println("B��dny wyb�r");
			}
		} while (out == false);
		magazyn.pokazProdukt(22);
	}
	
	public static void okreslProdukt() {
		if (wybor.equalsIgnoreCase("3")){
			System.out.print("Podaj nazw�: ");
			nazwa = rl.nextLine();
		}
		if (wybor.equalsIgnoreCase("3")){
			System.out.print("\nPodaj kod: ");
			kod = rl.nextInt();
		}
		if (wybor.equalsIgnoreCase("3")){
			System.out.print("\nPodaj cen�: ");
			cena = rl.nextFloat();
		}
		if (wybor.equalsIgnoreCase("3")){
			System.out.print("Podaj stan magazynowy: ");
			liczba = rl.nextInt();
		}
	}

}
