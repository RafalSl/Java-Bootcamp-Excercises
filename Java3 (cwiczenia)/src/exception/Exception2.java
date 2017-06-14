package exception;

public class Exception2 extends Exception {
	
	public void message(){
		System.out.println("Wyj¹tkowy wyj¹tek: " + this.getClass().getSimpleName());
	}

}
