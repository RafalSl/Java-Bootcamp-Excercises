package firma_zapis_do_pliku;

public class Company {
	private Employee[] pracownicy = new Employee[3];

	public Company(Employee[] pracownicy) {
		super();
		this.pracownicy = pracownicy;
	}

	public Employee getPracownicy(int numer) {
		return pracownicy[numer];
	}

	public void setPracownicy(Employee pracownik, int numer) {
		this.pracownicy[numer] = pracownik;
	}
	
	
}
