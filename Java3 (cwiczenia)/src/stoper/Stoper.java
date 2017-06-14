package stoper;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		String a;
		
		do {
		System.out.println("Naciœnij enter, by uruchomiæ stoper");
		a = rl.nextLine();
		Instant start = Instant.now();
		System.out.println("Naciœnij enter, by zatrzymaæ stoper");
		a = rl.nextLine();
		Instant stop = Instant.now();
		Duration pomiar = Duration.between(start, stop);
		float seconds = (pomiar.getSeconds() + (pomiar.getNano()/ (float)1000000000));
		System.out.println("Pomiar: " + seconds);
		} while (!a.equals("q"));
	}
}
