package exception;

public class Exception2 extends Exception {
	
	public void message(){
		System.out.println("Wyj�tkowy wyj�tek: " + this.getClass().getSimpleName());
	}

}
