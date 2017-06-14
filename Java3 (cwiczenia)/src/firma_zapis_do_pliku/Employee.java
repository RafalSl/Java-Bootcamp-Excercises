package firma_zapis_do_pliku;

public class Employee extends Person {
	private float salary;

	public Employee(String imie, String nazwisko, int salary) {
		super(imie, nazwisko);
		this.salary = salary;
	}
	
	public Employee(String imie, String nazwisko) {
		super(imie, nazwisko);
		this.salary = 0;
	}
	
	public Employee() {
		super();
		this.salary = 0;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
}
