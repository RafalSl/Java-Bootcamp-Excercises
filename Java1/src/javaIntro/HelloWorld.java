package javaIntro;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.math.BigInteger;

public class HelloWorld {

	public static void main(String[] args) {
		/*Program wyœwietla stringi na ekranie.
		 * Jx odpowiadaj¹ numerom æwiczeñ.
		 * Ten komentarz jest æwiczeniem J4
		 */
//		System.out.println("Hello world");
//		System.out.println(System.getProperty("java.runtime.version"));
//		J1
		/*System.out.println("Ala Kala Wala");
//		J2
		System.out.println("SQL");
		System.out.println("Python");
		System.out.println("Front-end");
		System.out.println("Java");*/
//		J3
		System.out.println("###Program1###");
		System.out.println("Ala Kala Wala");
		System.out.println("###Program2###");
		System.out.println("SQL\nPython\nFront-end\nJava");
		System.out.println("##############");
//		J5
		System.out.println("J\ta   v\tv  a\nJ   a a    v    v   a a\nJ   J   aaaaaaa    V V aaaaaa\nJJ a\ta  a aaaa");
//		J6
		byte wiek = 25;
		System.out.println("Czeœæ Jan, s³ysza³em, ¿e masz " + wiek + " lat.");
		System.out.println(true);
		System.out.println("Czy twoje inicja³y to " + 'J' + 'K' + '?');
		System.out.println("Tak, " + true);
//		J7
		int a = 2;
		final String STALA1 = "abc";
		double ulamek = 99.99;
		System.out.println(a*a);
		System.out.println(STALA1);
		System.out.println(ulamek/a);
//		Stringi
		String words = "  Jeden dwa trzy cztery piêæ szeœæ siedem "; 
        String sub1 = words.substring(2, 7); 
        String sub2 = words.replaceAll("dwa", "hehe"); 
        String sub3 = words.trim(); 
        char charat = words.charAt(2); 
        System.out.println(words); 
        System.out.println("words.substring(2, 7)"); 
        System.out.println(sub1); 
        System.out.println("words.replaceAll(\"dwa\", \"hehe\")"); 
        System.out.println(sub2); 
        System.out.println("words.trim()"); 
        System.out.println(sub3); 
        System.out.println("words.charAt(2)"); 
        System.out.println(charat); 
        System.out.println(words.trim().charAt(2));
//		J8
        String pierwszy = "Pierwszy";
        String drugi = "Drugi";
        String trzeci = pierwszy + drugi;
        String czwarty = trzeci + " czwarty";
        System.out.println(trzeci.toUpperCase() + " " + czwarty.toLowerCase());
        StringBuffer s3 = new StringBuffer();
        s3.append(pierwszy);
        s3.append(" ");
        s3.append(drugi);
        StringBuffer s4 = new StringBuffer(s3);
        s4.append(" czwarty");
        System.out.println("toUpperCase s3: " + s3.toString().toUpperCase());
        System.out.println("toLowerCase s4: " + s4.toString().toLowerCase());
        System.out.println("toLowerCase + reverse s4: " + s4.reverse().toString().toLowerCase());
//      J9
        System.out.println("J9");
        System.out.println("length s4: " + s4.toString().length());
        System.out.println("charAt 2, 5 s3: " + s3.toString().charAt(2) + s3.toString().charAt(5));
        System.out.println("charAt - 3 s4: " + s4.reverse().toString().charAt(s4.toString().length()-3));
//      J10
        System.out.println("J10");
        System.out.println(s4.toString().substring(0, (pierwszy.length() + drugi.length() + 1)));

//      Operator trójargumentowy
        int i = 10;
        int j = 11;
        int wynik = i == j ? 4 : 5;
        System.out.println(wynik);
        wynik = i != j ? 4 : 5;
        System.out.println(wynik);
        int gf = 5;
        double gh = 13.5;
        double wynik1 = gf/gh;
        System.out.println(wynik1);
        System.out.println(Math.round(wynik1));
//      J11
        float f1 = 55.34f;
        float f2 = 12.44f;
        int wynik2 = (int) (f1/f2);
        System.out.println(wynik2);
//      J12
        System.out.println(f1 + f2);
        System.out.println(f1 - f2);
        System.out.println(f1 * f2);
        System.out.println(f1 / f2);
        System.out.println((int) (f1 % f2));
//  	J13
        System.out.println("-5 + 8 * 6 = " + (-5f + 8 * 6));
        System.out.println("(55+9) % 9 = " + ((55f+9) % 9));
        System.out.println("20 + -3 * 5 / 8 = " + (20f + -3 * 5f / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
//      J14
        for(int h=1; h < 10; h++){
        	System.out.println(5 * h);
        }
//      J15
        System.out.println("((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5)) = " + round((((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5))*100)/100));
//      J16
        int x;
        int y;
        Random o1 = new Random();
        x = o1.nextInt(100);
        y = o1.nextInt(100);
        System.out.println(x + " " + y);
        System.out.println("x > y - " + (x > y));
        System.out.println("2x > y - " + (2*x > y));
        System.out.println("x+3 > y && x-2 < y - " + (x+3 > y && x-2 < y ));
        System.out.println("xy jest parzysty - " + (x*y % 2 == 0));
        
        double liczba = 9.0; 
        int b = 3; 
        double pierwiastek = sqrt(liczba); 
        double potega = pow(liczba, b); 
        System.out.println(pierwiastek + " " + potega);
        
        /*BigInteger duza_liczbaA = new BigInteger("4565564685465");
        BigInteger duza_liczbaB = new BigInteger("456616554465465");
        System.out.println(duza_liczbaA.add(duza_liczbaB));
        System.out.println(duza_liczbaA.subtract(duza_liczbaB));
        System.out.println(duza_liczbaA.multiply(duza_liczbaB));
        System.out.println(duza_liczbaA.divide(duza_liczbaB));*/
        // i/o
        /*Scanner rl = new Scanner(System.in);
        System.out.print("Podaj swoje imiê: ");
        String imie = rl.nextLine();
        System.out.println("Witaj w kursie Javy " + imie + "!");
        rl.close();*/
        
        /*Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
        //pobierz znak nowej linii \n 
        sc.nextLine(); 
        //teraz mo¿esz pobraæ od u¿ytkownika napis 
        String word = sc.nextLine(); 
        //obie wartoœci zostaj¹ wyœwietlone 
        System.out.println(number); 
        System.out.println(word); 
        sc.close(); */
//      J20
        Scanner rl = new Scanner(System.in);
        /*System.out.print("Podaj pierwsz¹ liczbê: ");
        double suma = rl.nextDouble();
        System.out.print("Podaj drug¹ liczbê: ");
        suma += rl.nextDouble();
        System.out.print("Podaj trzeci¹ liczbê: ");
        suma += rl.nextDouble();
        System.out.print("Œrednia: " + (suma/3));
//        J21
        double l2 = rl.nextDouble();
        System.out.println("suma < l2: " + (suma < l2));
        System.out.println("suma <= l2: " + (suma <= l2));
        System.out.println("suma != l2: " + (suma != l2));*/
//        rl.close();
//        J22
/*        System.out.print("Podaj d³ugoœæ boku szeœciok¹ta formenego: ");
        double bok = rl.nextDouble();
        System.out.println("Pole powierzchni wynosi: " + (3*bok*sqrt(3)/2));
//        J23
        System.out.print("Podaj wspó³rzêdn¹ x punktu A: ");
        int x1 = rl.nextInt();
        System.out.print("Podaj wspó³rzêdn¹ y punktu A: ");
        int y1 = rl.nextInt();
        System.out.print("Podaj wspó³rzêdn¹ x punktu B: ");
        int x2 = rl.nextInt();
        System.out.print("Podaj wspó³rzêdn¹ y punktu B: ");
        int y2 = rl.nextInt();
        // sqrt(pow((x1-x2), 2) + pow(cos(x1*PI/180)*(y2-y1), 2)) * 111
        System.out.print("Odleg³oœæ miêdzy punktami A i B wynosi: " + (sqrt(pow((x1-x2), 2) + pow(cos(x1*PI/180)*(y2-y1), 2)) * 111) + " km");*/
//      J24
        System.out.print("Wpisz coœ: ");
        String wejscie = rl.nextLine();
        StringBuffer napis = new StringBuffer(wejscie);
        System.out.println(napis.reverse().toString());
        rl.close();        
	}
}