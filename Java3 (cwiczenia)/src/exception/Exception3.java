package exception;

public class Exception3 extends Exception {

	public void message(){
		System.out.println("Wyj�tkowy wyj�tek: " + this.getClass().getSimpleName());
	}

}
