package exception;

public class Exception1 extends Exception {

	public void message(){
		System.out.println("Wyj�tkowy wyj�tek: " + this.getClass().getSimpleName());
	}

}
