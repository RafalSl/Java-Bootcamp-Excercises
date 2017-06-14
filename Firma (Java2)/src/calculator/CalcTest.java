package calculator;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Dodawanie liczb ca³kowitych.");
		System.out.print("Podaj a): ");
		int a = rl.nextInt();
		System.out.print("Podaj b: ");
		int b = rl.nextInt();
		System.out.println(Calculator.add(a, b));
		
		System.out.println("Dodawanie liczb ca³kowitych.");
		System.out.print("Podaj a): ");
		int a1 = rl.nextInt();
		System.out.print("Podaj b: ");
		int b1 = rl.nextInt();
		System.out.print("Podaj c: ");
		int c1 = rl.nextInt();
		System.out.println(Calculator.add(a1, b1, c1));
		
		System.out.println("Odejmowanie liczb ca³kowitych.");
		System.out.print("Podaj a): ");
		int a11 = rl.nextInt();
		System.out.print("Podaj b: ");
		int b11 = rl.nextInt();
		System.out.println(Calculator.subs(a11, b11));

		
		System.out.println("Odejmowanie liczb ca³kowitych.");
		System.out.print("Podaj a): ");
		int a111 = rl.nextInt();
		System.out.print("Podaj b: ");
		int b111 = rl.nextInt();
		System.out.print("Podaj c: ");
		int c111 = rl.nextInt();
		System.out.println(Calculator.add(a111, b111, c111));
		
		rl.close();

	}

}
