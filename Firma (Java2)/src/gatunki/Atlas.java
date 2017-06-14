package gatunki;

import java.util.ArrayList;
import java.util.Scanner;

public class Atlas {

	public static void main(String[] args) {
		ArrayList<Gatunek> atlas = new ArrayList<>();
		String rodzaj, gatunek, dalej;
		int chromo;
		Scanner rl = new Scanner(System.in);
		
		do {
			System.out.print("Podaj rodzaj: ");
			rodzaj = rl.nextLine();
			System.out.print("Podaj gatunek: ");
			gatunek = rl.nextLine();
			System.out.print("Podaj liczbê chromosomów: ");
			chromo = rl.nextInt();
			rl.nextLine();
			Gatunek nowyGatunek = new Gatunek(rodzaj, gatunek, chromo);
			atlas.add(nowyGatunek);
			System.out.print("Dodaæ kolejny wpis do atlasu? (t/n) ");
			dalej = rl.nextLine();
		} while (!(dalej.equals("n") || dalej.equalsIgnoreCase("N"))); 
		
		atlas.get(0).all();
		rl.close();
	}

}
