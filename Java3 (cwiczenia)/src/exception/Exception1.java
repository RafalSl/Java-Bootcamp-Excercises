package exception;

public class Exception1 extends Exception {

	public void message(){
		System.out.println("Wyj¹tkowy wyj¹tek: " + this.getClass().getSimpleName());
	}

}
