package owoce;

public class Apple extends Fruit {
	private String rodzaj;
	
	public Apple() {
		this.rodzaj = "Jab�ko nieznanego rodzaju";
	}
	
	public Apple(String rodzaj) {
		this.rodzaj = rodzaj;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Jab�ko rodzaju: " + rodzaj);
	}

	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}
	
}
