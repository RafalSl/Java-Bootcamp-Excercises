package javaIntro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
//		J40
/*		System.out.print("Podaj liczbê: ");
		int x = rl.nextInt();
		System.out.println("");
		System.out.print("Dzielniki " + x + ": ");
		for(int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
			}
		}*/
//		J41
		/*int[] tab1 = {1, 2, 3};
		int[] tab2 = {5, 15, 32};
		int suma = 0;
		for(int i = 0; i < 3; i++) {
			suma += tab1[i];
		}
		for(int i = 0; i < 3; i++) {
			suma += tab2[i];
		}
		System.out.print("Suma: " + suma);*/
//		J42
/*		Random los = new Random();
		int[] tab = new int[10];
		int tabMin = 10, tabMax = -10, suma = 0, bAvg = 0, aAvg = 0;
		for(int i = 0; i <10; i++) {
			tab[i] = los.nextInt(21) - 10;
		}
		System.out.print("Elementy tablicy: ");
		for(int i = 0; i <10; i++) {
			System.out.print(tab[i] + "; " );
			if (tab[i] < tabMin) tabMin = tab[i];
			if (tab[i] > tabMax) tabMax = tab[i];
			suma += tab[i];
		}
		System.out.println("\nSuma elementów tablicy: " + suma);
		System.out.println("Œrednia arytmetyczna elementów tablicy: " + (float)suma/10);
		System.out.println("Najmniejszy element tablicy: " + tabMin);
		System.out.println("Najwiêkszy element tablicy: " + tabMax);
		System.out.print("Elementy tablicy w odwrotnej kolejnoœci: ");
		for(int i = 9; i >= 0; i--) {
			if (tab[i] < (float)suma/10) bAvg++;
			if (tab[i] > (float)suma/10) aAvg++;
			System.out.print(tab[i] + "; " );
		}
		System.out.println("\nLiczba elementów mniejszych od œredniej: " + bAvg);
		System.out.println("Liczba elementów wiêkszych od œredniej: " + aAvg);*/
//		J43	
/*		Random los = new Random();
		int[] tab = new int [20];
		int duplicate = 0;
		System.out.print("Elementy tablicy: ");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = los.nextInt(10) + 1;
			System.out.print(tab[i] + "; " );
		}
		
		for(int i = 1; i < 11; i++) {
			for(int j = 0; j < tab.length; j++) {
				if (tab[j] == i) duplicate++;
			}
			System.out.print("\nPowtórzenia " + i + ": ");
			System.out.print(duplicate);
			duplicate = 0;
		}*/
//		J44
/*		Random los = new Random();
		int[][] tab = new int[5][5];
		int[][] minmax = new int[5][2];
		int tmpMin = 5, tmpMax = -5;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				tab[i][j] = los.nextInt(11) - 5;
				System.out.printf("%3d", tab[i][j]);
			}
			System.out.println();
		}
//		for(int a = 0; a < 2; a++){
			for(int j = 1; j < 6; j++) {
				for(int i = 0; i < 5; i++) {
					if (tab[i][j-1] < tmpMin) tmpMin = tab[i][j-1];
					if (tab[i][j-1] > tmpMax) tmpMax = tab[i][j-1];
					
				}
				System.out.println("Minimum dla kolumny " + j + ": " + tmpMin);
				System.out.println("Maksimum dla kolumny " + j + ": " + tmpMax);
				tmpMin = 5;
				tmpMax = -5;
			}*/
//		}
//		J45
/*		int x = rl.nextInt();
		int[] tab = new int[32];
		int i = 0;
		do {
			tab[i] = x % 2;
			x /= 2;
			i++;
		} while (x != 0);
		
		int flag = 0;
		for(int j = tab.length - 1; j >= 0; j--) {
			if(flag == 0) continue;
			System.out.print(tab[j]);
		}*/
//		J46
/*		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		int[][] m1plusm2 = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				if (i==j) {
					m1[i][j] = 1;
					} 
				else m1[i][j] = 0;
			}
		}
		m2 = m1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				System.out.printf("%3d", m1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				System.out.printf("%3d", m2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				m1plusm2[i][j] = m1[i][j] + m2[i][j];
				System.out.printf("%3d", m1plusm2[i][j]);
			}
			System.out.println();
		}*/
//		J41
/*		int[][] t1 = new int[11][11];
		for(int i = 0; i < 12; i++) {
			if (i == 0){
				t1[0][i] = 1;
			} else {
			t1[0][i] = i;
			System.out.printf("%3d", t1[0][i]);
			}
		}
		System.out.println();
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 12; j++){
				if (j == 0){
					t1[i-1][j-1] = i;
					System.out.printf("%3d", t1[i-1][j-1]);
				} else {
					t1[i-1][j-1] = i * j;
					System.out.printf("%3d", t1[i-1][j-1]);
				}
			}
			System.out.println();
		}*/
//		J48
/*		ArrayList<String> lista = new ArrayList<>();
		String ciag = new String();
		while (ciag.equals("end") != true) {
			ciag = rl.nextLine();
			if (ciag.equals("end") == true) break;
			lista.add(ciag);
		}
		System.out.println(lista);
		*/
//		J49 + J50
		HashMap<String, Float> produkty = new HashMap<>();
		HashSet<String> zakupy = new HashSet<>();
		String ciag = new String();
		float suma = 0;
		produkty.put("Mleko", (float) 2);
		produkty.put("Woda", (float) 1.8);
		produkty.put("Jajka", (float) 8.99);
		produkty.put("Bu³ki", (float) 0.25);
		System.out.println(produkty);
//		boolean ok = true; - to trzeba wykorzystaæ do sprawdzenia czy twoar jest dostêpny - czy jest w kluczach produkty
		while (!ciag.equals("end")) {
			ciag = rl.nextLine();
			if (zakupy.contains(ciag)) {
				System.out.println(ciag + " jest ju¿ w koszyku. Dodaæ kolejny? (t/n)");
				String dalej = rl.nextLine();
				if (!dalej.equals("t") && !dalej.equals("T")) continue;
			}
			if (ciag.equals("end")) break;
			suma += produkty.get(ciag);
			zakupy.add(ciag);
		}
		System.out.println(suma);
		rl.close();
	}

}
