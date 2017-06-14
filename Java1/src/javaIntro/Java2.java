package javaIntro;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;

public class Java2 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
//		J25
/*		System.out.print("Podaj a: ");
		double a = rl.nextDouble();
		rl.nextLine();
		System.out.print("Jakie dzia³anie chcesz wykonaæ (+, -, *, /): ");
		char dzialanie = rl.nextLine().trim().charAt(0);
		System.out.print("Podaj b: ");
		double b = rl.nextDouble();	
		
		switch (dzialanie) {
		case '+':
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case '/':
			System.out.println(a + " / " + b + " = " + (a/b));
			break;
		default:
			System.out.println("Spróbuj jeszcze raz.");
		}*/
//		J26
		/*System.out.print("Podaj a: ");
		double a = rl.nextDouble();
		if (a >= 0 && a <= 1) {
			System.out.println("Liczba " + a + " jest z przedzia³u <0,1>.");
		} else {
			System.out.println("Liczba " + a + " NIE jest z przedzia³u <0,1>.");
		}*/
		
//		J27
		/*Random losowanie = new Random();
		int a1 = losowanie.nextInt(100);
		int a2 = losowanie.nextInt(100);
		int a3 = losowanie.nextInt(100);
		int a4 = losowanie.nextInt(100);
		int a5 = losowanie.nextInt(100);
		System.out.print("Podaj b: ");
		int b = rl.nextInt();
		System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
		if (a1 == b) {
			System.out.println(a1 + " = " + b);
		} else if (a1 < b) {
			System.out.println(a1 + " < " + b);
		} else {
			System.out.println(a1 + " > " + b);
		}
		if (a2 == b) {
			System.out.println(a2 + " = " + b);
		} else if (a2 < b) {
			System.out.println(a2 + " < " + b);
		} else {
			System.out.println(a2 + " > " + b);
		}
		if (a3 == b) {
			System.out.println(a3 + " = " + b);
		} else if (a3 < b) {
			System.out.println(a3 + " < " + b);
		} else {
			System.out.println(a3 + " > " + b);
		}
		if (a4 == b) {
			System.out.println(a4 + " = " + b);
		} else if (a4 < b) {
			System.out.println(a4 + " < " + b);
		} else {
			System.out.println(a4 + " > " + b);
		}
		if (a5 == b) {
			System.out.println(a5 + " = " + b);
		} else if (a5 < b) {
			System.out.println(a5 + " < " + b);
		} else {
			System.out.println(a5 + " > " + b);
		}*/
//		J28
/*		System.out.print("Wybierz zadanie (1, 2, 3, q - wyjœcie)");
		char wybor = rl.nextLine().trim().charAt(0);
		switch (wybor) {
			case '1':
				System.out.print("Podaj a: ");
				double a = rl.nextDouble();
				rl.nextLine();
				System.out.print("Jakie dzia³anie chcesz wykonaæ (+, -, *, /): ");
				char dzialanie = rl.nextLine().trim().charAt(0);
				System.out.print("Podaj b: ");
				double b = rl.nextDouble();	
				
				switch (dzialanie) {
				case '+':
					System.out.println(a + " + " + b + " = " + (a+b));
					break;
				case '-':
					System.out.println(a + " - " + b + " = " + (a-b));
					break;
				case '*':
					System.out.println(a + " * " + b + " = " + (a*b));
					break;
				case '/':
					System.out.println(a + " / " + b + " = " + (a/b));
					break;
				default:
					System.out.println("Spróbuj jeszcze raz.");
				}
				break;
			
			case '2': 
				System.out.print("Podaj a: ");
				double c = rl.nextDouble();
				if (c >= 0 && c <= 1) {
					System.out.println("Liczba " + c + " jest z przedzia³u <0,1>.");
				} else {
					System.out.println("Liczba " + c + " NIE jest z przedzia³u <0,1>.");
				}
				break;
			
			case '3': 
				Random losowanie = new Random();
				int a1 = losowanie.nextInt(100);
				int a2 = losowanie.nextInt(100);
				int a3 = losowanie.nextInt(100);
				int a4 = losowanie.nextInt(100);
				int a5 = losowanie.nextInt(100);
				System.out.print("Podaj d: ");
				int d = rl.nextInt();
				System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
				if (a1 == d) {
					System.out.println(a1 + " = " + d);
				} else if (a1 < d) {
					System.out.println(a1 + " < " + d);
				} else {
					System.out.println(a1 + " > " + d);
				}
				if (a2 == d) {
					System.out.println(a2 + " = " + d);
				} else if (a2 < d) {
					System.out.println(a2 + " < " + d);
				} else {
					System.out.println(a2 + " > " + d);
				}
				if (a3 == d) {
					System.out.println(a3 + " = " + d);
				} else if (a3 < d) {
					System.out.println(a3 + " < " + d);
				} else {
					System.out.println(a3 + " > " + d);
				}
				if (a4 == d) {
					System.out.println(a4 + " = " + d);
				} else if (a4 < d) {
					System.out.println(a4 + " < " + d);
				} else {
					System.out.println(a4 + " > " + d);
				}
				if (a5 == d) {
					System.out.println(a5 + " = " + d);
				} else if (a5 < d) {
					System.out.println(a5 + " < " + d);
				} else {
					System.out.println(a5 + " > " + d);
				}
				break;
			
			case 'q': 
				System.out.print("Do zobaczenia!");
				break;
			default: 
				System.out.print("Niepoprawny wybór.");
			
		}*/
//		J29
/*		System.out.print("Podaj liczbê: ");
		int liczba = rl.nextInt();
		int suma = 0;
		for (int i = 1; i <= liczba; i += 2) {
			System.out.print(i + " ");
			suma += i;
		}
		System.out.println("");
		for(int j = 2; j <= liczba; j+=2) {
			System.out.print(j + " ");
			suma += j;
		}
		System.out.println("");
		System.out.println("Suma powy¿szych liczb: " + suma);*/
//		J30
/*		System.out.print("Podaj pierwszy wyraz: ");
		String pierwszy = rl.nextLine();
		System.out.print("Podaj drugi wyraz: ");
		String drugi = rl.nextLine();
		String[] podciag = new String[10];
		podciag = pierwszy.split(Character.toString(drugi.charAt(drugi.length()-3)));
		for (String tmp: podciag) {
			System.out.println(tmp);
		}*/
/*		System.out.print("Podaj pierwszy wyraz: ");
		String pierwszy = rl.nextLine();
		System.out.print("Podaj drugi wyraz: ");
		String drugi = rl.nextLine();
		for (int i = 0; i < pierwszy.length(); i++) {
			System.out.print(pierwszy.charAt(i));
			if (pierwszy.charAt(i) == drugi.charAt(drugi.length()-3)) {
				System.out.print("; ");
			}
		}*/
//		J31
/*		System.out.print("Podaj swój wiek: ");
		int wiek = rl.nextInt();
		if(wiek<0) {
			System.out.print("Jeszcze siê nie urodzi³eœ");
		} else if(wiek<18) {
			System.out.print("Jeszcze nie mo¿esz g³osowaæ");
		} else {
			System.out.print("Mo¿esz g³osowaæ");
		}*/
//		J32
/*		System.out.print("Wpisz zdanie: ");
		String napis = rl.nextLine();
		System.out.print("Podaj liczbê: ");
		int liczba = rl.nextInt();
		for(int i = 0; i < napis.length(); i += liczba) {
			System.out.print(napis.charAt(i));
		}*/
//		J33
/*		System.out.print("Podaj liczbê: ");
		int a = rl.nextInt();
		System.out.print("Podaj drug¹, wiêksz¹ liczbê: ");
		int b = rl.nextInt();
		int suma1 = a, suma2 = a, suma3 = a, j = a+1, k = a+1;
		for(int i = a+1; i <= b; i++) {
			suma1 += i;
		}
		System.out.println("Suma ci¹gu A do B: " + suma1);

		while(j <= b) {
			suma2 += j++;
		}
		System.out.println("Suma ci¹gu A do B: " + suma2);
		do {
			suma3 += k++;
		} while (k <= b);
		System.out.println("Suma ci¹gu A do B: " + suma3);*/
//		J34
/*		System.out.print("Podaj n: ");
		int n = rl.nextInt();
		for(int i = 0; i <= n; i++) {
			System.out.println("2 ** " + i + " = " + (int)pow(2, i));
		}*/
//		J35
/*		double x, suma = 0;
		do {
			System.out.print("Podaj liczbê: ");
			x = rl.nextDouble();
			suma += x;
		} while (x != 0);
		System.out.println("Suma: " + suma);*/
//		J36
/*		int x;
		double a = 0, b = 0;
		System.out.print("Podaj liczbê: ");
		do {
			x = rl.nextInt();
			if (x < a || a == 0) {
				a = x;
			}
			if (x > b || b == 0) {
				b = x;
			}
		} while (x != 0);
		System.out.println(a);
		System.out.println(b);
		System.out.println("Suma najmniejszej i najwiêkszej liczby: " + (a + b));
		System.out.println("Œrednia artymetyczna: " + ((a + b) / 2));*/
//		J37
/*		Random losowanie = new Random();
		int x = losowanie.nextInt(101), guess, i = 0;
		System.out.println("Zgadnij x z przedzia³u 0-100");
		do {
			System.out.print("Twój typ: ");
			guess = rl.nextInt();
			i++;
			if (guess < x) {
				System.out.println("Za ma³o\n");
			} 
			if (guess > x) {
				System.out.println("Za du¿o\n");
			}
		} while (x != guess);
		System.out.print("Brawo!!! Zgad³eœ po " + i + " próbach.");
		rl.close();*/
		
//		Wersja z poziomami trudnoœci
/*		Random losowanie = new Random();
		int x = losowanie.nextInt(101), guess, i;
		System.out.println("Zgadnij x z przedzia³u 0-100");
		System.out.println("Wybierz poziom trudnoœci (1 - hard, 2 - easy)");
		String poziom = new String();
		poziom = rl.nextLine();
		switch (poziom) {
		case "1" :
			i = 4;
			while (i > 0) {
				System.out.print("Twój typ: ");
				guess = rl.nextInt();
				i--;
				if (guess == x) {
					System.out.print("Brawo, zgad³eœ!!!");
					break;
				}
				if (guess < x) {
					System.out.println("Za ma³o\nZosta³o prób: " + i);
				} 
				if (guess > x) {
					System.out.println("Za du¿o\nZosta³o prób: " + i);
				}
				if (i == 0) {
				System.out.print("Loooooser!!!");
				}
			}
			break;
		case "2":
			i = 7;
			while (i>0) {
				System.out.print("Twój typ: ");
				guess = rl.nextInt();
				i--;
				if (guess == x) {
					System.out.print("Brawo, zgad³eœ!!!");
					break;
				}
				if (guess < x) {
					System.out.println("Za ma³o\nZosta³o prób: " + i);
				} 
				if (guess > x) {
					System.out.println("Za du¿o\nZosta³o prób: " + i);
				}
				if (i == 0) {
					System.out.print("Looooser!!!");
					}
				
			}
			break;
		}*/
//		J38
/*		System.out.print("Podaj znak wype³nienia prostok¹ta: ");
		char wypelnienie = rl.nextLine().charAt(0);
		System.out.print("Podaj d³ugoœæ boku a prostok¹ta: ");
		int a = rl.nextInt();
		System.out.print("Podaj d³ugoœæ boku b prostok¹ta: ");
		int b = rl.nextInt();
		System.out.print("Podaj wspó³rzêdn¹ x lewego górnego boku: ");
		int x = rl.nextInt();
		System.out.print("Podaj wspó³rzêdn¹ y lewego górnego boku: ");
		int y = rl.nextInt();
		int i = 1, j = 1;
		while (i++ < y){
			System.out.println("");
		}
		for(int i1 = 0; i1 < b; i1++) {
			while (j++ <= x){
				System.out.print(" ");
			}
			for(int j1 = 0; j1 < a; j1++) {
				System.out.print(wypelnienie);
			}
			j = 1;
			System.out.println("");
		}*/
//		J39
		System.out.print("Podaj wysokoœæ choinki: ");
		int n = rl.nextInt();
		int x = 1;
		for(int i = 0; i < (n+0.3*n); i++) {
			if (i <= n-1) {	
				for(int j = 0; j < (n+10-i); j++) {
					System.out.print(' ');
				}
				for(int g = 0; g < x ; g++){
					System.out.print('*');
				}
				x += 2;
				System.out.println("");
			} else {			
				for(int j = 0; j < n+10; j++) {
					System.out.print(' ');
				}
				System.out.println('*');
			}	
		}
		
		rl.close();
	}
}


