package kasa;

public class Kasa {

	public static void main(String[] args) {
		Towary towary = new Towary();
		towary.addTowar();
		towary.rmTowar();
			
		}
	
	void menu() {
		System.out.print("Menu\n1. Zakupy\n2. Opcje kasy\nQ. wyjœcie");
	}

}
