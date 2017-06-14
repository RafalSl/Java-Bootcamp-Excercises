package firstConnection;

import java.util.ArrayList;
import java.util.Scanner;

public class Record {
	Scanner rl = new Scanner(System.in);
	
	
	public ArrayList createRecord() {		
		System.out.print("Podaj imiê: ");
		String imie = rl.nextLine();
		System.out.print("Podaj nazwisko: ");
		String nazwisko = rl.nextLine();
		System.out.print("Podaj PESEL: ");
		String pesel = rl.nextLine();
		String sql = "INSERT INTO uzytkownicy (imie, nazwisko, pesel) VALUES ('" + imie + "', '" + nazwisko + "', '" + pesel + "')";
		ArrayList<String> newRecord = new ArrayList<>();
		newRecord.add(imie);
		newRecord.add(nazwisko);
		newRecord.add(pesel);
		return newRecord;
	}
}
