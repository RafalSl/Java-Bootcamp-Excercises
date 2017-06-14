package firma_zapis_do_pliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner rl = new Scanner(System.in);
		File rf = new File("pracownicy.txt");
		PrintWriter wf = new PrintWriter("pracownicy.txt");
		AppController controller = new AppController();
		String wybor;
		
		do {
			System.out.println("Menu\n1. Odczyt informacji o pracownikach\n2. Wprowadz nowe informcje o pracownikach\nq. Wyjœcie z programu");
			wybor = rl.nextLine();
			switch (wybor) {
			case "1":
				controller.readFile();
				controller.showEmployees();
				break;
			case "2":
				break;
			case "q":
				break;
			default:
				System.out.println("B³êdny wybór");
			}
		} while (!(wybor.equals("q")));
	}

}
