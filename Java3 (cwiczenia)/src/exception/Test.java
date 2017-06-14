package exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test {
	private static Scanner rl = new Scanner(System.in);
	
	public static void main(String[] args) {
		String napis;
		Test z = new Test();
		
//		napis = rl.nextLine();
		napis = null;
		try {
			System.out.println(napis.length());
		} catch (NullPointerException e) {
			System.out.println("Brak napisu");
		}
		
		try {
			generatorPomylek();
		} catch (Exception1 e) {
			e.message();
		} catch (Exception2 e) {
			e.message();
		} catch (Exception3 e) {
			e.message();
		}
		
		while (true) {
		try {
			z.dajLiczbe();
			break;
		} catch (InputMismatchException e) {
			System.out.println("Potrzebujê liczbê ca³kowit¹.");
			rl.nextLine();
		}
		}
	}
	
	public static void generatorPomylek() throws Exception1, Exception2, Exception3 {
		Random los = new Random();
		int exception = los.nextInt(3);
		System.out.println("Exception w generatorze: " + exception);
		switch (exception) {
		case 0:
			throw new Exception1();
		case 1:
			throw new Exception2();
		case 2:
			throw new Exception3();
		}
	}
	
	public int dajLiczbe() {
		System.out.print("\nPodaj liczbê: ");
		int liczba = rl.nextInt();
		return liczba;
	}

}
