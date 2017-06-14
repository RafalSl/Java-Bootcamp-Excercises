package kasa;

import java.util.HashMap;
import java.util.Scanner;

public class Towary {
	Scanner rl = new Scanner(System.in);
	HashMap<String, Towar> towary = new HashMap<>();
	String nazwa, dalej;
	float cena;
	
	void addTowar() {
		do {
			System.out.print("Wprowadzasz nowy towar do pami�ci kasy.\nPodaj nazw� produktu: ");
			nazwa = rl.nextLine();
			if (towary.containsKey(nazwa)) {
				System.out.print("Towar " + nazwa + " jest ju� w bazie. Chcesz go zmodyfikowa�? (t/n)");
				dalej = rl.nextLine();
				if (dalej.equals("t") || dalej.equals("T")) {
					updateCena();
				} else continue;
			} else {
				System.out.print("Podaj cen� " + nazwa + ": ");
				cena = rl.nextFloat();
				rl.nextLine();
				Towar nowytowar = new Towar(nazwa, cena);
				towary.put(nowytowar.nazwa, nowytowar);
				System.out.println("Dodano nowy produkt: " + towary.get(nazwa).nazwa + " cena:" + towary.get(nazwa).cenat);
			}
			System.out.print("\nDoda� kolejny produkt? (t/n)");
			dalej = rl.nextLine();
			System.out.println();
		} while (!(dalej.equals("n") || dalej.equals("N")));
		
	}
	
	void updateCena() {
		System.out.print("Podaj now� cen� dla " + towary.get(nazwa).nazwa + ". Dotychczasowa cena: " + towary.get(nazwa).cenat);
		float nowacena = rl.nextFloat();
		towary.get(nazwa).cenat = nowacena;
		System.out.println("Zmodyfikowano " + towary.get(nazwa).nazwa + ". Nowa cena: " + towary.get(nazwa).cenat);
	}
	
	void rmTowar() {
		do {
			showTowary();
			System.out.print("Podaj nazw� produktu do usuni�cia: ");
			nazwa = rl.nextLine();
			if (towary.containsKey(nazwa)){
				towary.remove(nazwa);
				System.out.println("Usni�to " + nazwa);
			} else System.out.println("Brak produktu " + nazwa + " w bazie.");
			System.out.print("\nUsun�� kolejny produkt? (t/n)");
			dalej = rl.nextLine();
		} while (!(dalej.equals("n") || dalej.equals("N")));
	}
	
	void showTowary() {
		System.out.println(towary.keySet());
		/*String tmp;
		Object[] listaTowarow = new ArrayList<>();
		listaTowarow = towary.keySet().toArray();
		for(int i = 0; i < listaTowarow.length; i++) {
			tmp = (String) listaTowarow[i];
			System.out.println(listaTowarow[i] + " cena: ");
		}*/
	}
}
