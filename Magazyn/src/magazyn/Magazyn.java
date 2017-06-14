package magazyn;

import java.util.HashMap;
import java.util.Scanner;

import towary.Produkt;

public class Magazyn {
	private HashMap<Integer, Produkt> rejestr = new HashMap<>();
	private HashMap<Integer, Integer> stan = new HashMap<>();
	Scanner rl = new Scanner(System.in);
	
	public Magazyn() {
		
	}
	
	public boolean sprawdzRejestr(int kod) {
		return (rejestr.containsKey(kod));
	}
	
	public void pokazProdukt(int kod) {
		Produkt produkt = rejestr.get(kod);
		System.out.println(produkt.getNazwa() + "(kod: " + produkt.getKod() + "), cena: " + produkt.getCena());
	}
	
	public void dodajProdukt(String nazwa, int kod, float cena) {
		Produkt nowyProdukt = new Produkt(nazwa, kod, cena);
		rejestr.put(kod, nowyProdukt);
	}
	
	public void pokazStan(int kod) {
		System.out.println(stan.get(kod));
	}
	
	public void updateStan(int kod, int liczba) {
		stan.put(kod, liczba);
	}

	public HashMap<Integer, Produkt> getRejestr() {
		return rejestr;
	}

	public void setRejestr(HashMap<Integer, Produkt> rejestr) {
		this.rejestr = rejestr;
	}

	public HashMap<Integer, Integer> getStan() {
		return stan;
	}

	public void setStan(HashMap<Integer, Integer> stan) {
		this.stan = stan;
	}
}
