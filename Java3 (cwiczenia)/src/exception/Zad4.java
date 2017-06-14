package exception;

public class Zad4 {
	
	void mozeZglosicWyjatek() throws Exception {
		if (new java.util.Random().nextInt(2) == 0)
			throw new Exception();
	}
}
