package Firma;

public class Chary {
	double liczba;
	char znak;
	
	Chary(double a){
		this.liczba = a;
	}
	
	Chary(char b){
		this.znak = b;
	}
	
	Chary(double a, char b){
		this(a);
		this.znak = b;
	}
	
	Chary(char b, double a){
		this(a, b);
	}
}
