package firma_zapis_do_pliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppController {
	private Scanner rl = new Scanner(System.in);
	private File file = new File("pracownicy.txt");
	private Scanner rf;
	private PrintWriter wf; 
	private Company company = new Company(null);
	private String pracownik;
	

	public void readFile() throws FileNotFoundException {
		int i = 0;
		rf = new Scanner(file);
		wf = new PrintWriter("pracownicy.txt");
		while (true) {
			if (rf.hasNextLine()) {
				pracownik = rf.nextLine();
				Employee employee = new Employee();
				company.setPracownicy(employee, i++);
			} else break;
		}
	}
	
	public void showEmployees() {
		for(int i = 0; i < 1
				//tu ma byæ d³ugoœæ tablicy pracownicy
				
				; i++) {
			
			System.out.println("Pracownik " + (i + 1) + ": " + company.getPracownicy(i).getImie() + " " + company.getPracownicy(i).getNazwisko());
			System.out.println("pensja: " + company.getPracownicy(i).getSalary());
			System.out.println();
		}
	}
	
	public void describeEmployee(String imie, String nazwisko, float pensja) {
		Employee employee = new Employee();
		employee.setImie(imie);
		employee.setNazwisko(nazwisko);
		employee.setSalary(pensja);
	}
	
	public void addEmployee() {
		System.out.println("Podaj imiê: ");
		String imie = rl.nextLine();
		System.out.println("Podaj nazwisko: ");
		String nazwisko = rl.nextLine();
		System.out.println("Podaj pensjê: ");
		float pensja = rl.nextFloat();
		describeEmployee(imie, nazwisko, pensja);
	}
}
