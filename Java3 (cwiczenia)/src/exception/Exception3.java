package exception;

public class Exception3 extends Exception {

	public void message(){
		System.out.println("Wyj¹tkowy wyj¹tek: " + this.getClass().getSimpleName());
	}

}
