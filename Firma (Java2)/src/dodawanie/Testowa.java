package dodawanie;

import java.util.Scanner;

public class Testowa {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Dodawanie liczb ca³kowitych.");
		System.out.print("Podaj a: ");
		int a = rl.nextInt();
		System.out.print("Podaj b: ");
		int b = rl.nextInt();
		System.out.println(Dodawanie.dodaj(a, b));
		
		System.out.println("Dodawanie liczb zmiennoprzecinkowych float.");
		System.out.print("Podaj a: ");
		float af = rl.nextFloat();
		System.out.print("Podaj b: ");
		float bf = rl.nextFloat();
		System.out.println(Dodawanie.dodaj(af, bf));
		
		System.out.println("Dodawanie liczb zmiennoprzecinkowych double.");
		System.out.print("Podaj a: ");
		double ad = rl.nextDouble();
		System.out.print("Podaj b: ");
		double bd = rl.nextDouble();
		System.out.println(Dodawanie.dodaj(ad, bd));
		rl.close();
	}

}
