package exception;

public class Wyjatki {

	public static void main(String[] args) {
		Zad4 z = new Zad4();
		int i = 1;
		try {
			z.mozeZglosicWyjatek();
			i++;
			z.mozeZglosicWyjatek();
			i++;
			z.mozeZglosicWyjatek();
			i++;
			z.mozeZglosicWyjatek();
			i++;
			z.mozeZglosicWyjatek();
		} catch (Exception e) {
			System.out.println("Wyj¹tek w z.mozeZglosicWyjatek() " + i);
		}

	}

}
