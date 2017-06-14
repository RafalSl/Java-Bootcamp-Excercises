package gatunki;

public class Gatunek {
	String rodzaj;
	String gatunek;
	int chromo;
	Chromosom[] tab_ch;
	
	Gatunek(String rodzaj, String gatunek, int chromo){
		this.rodzaj = rodzaj;
		this.gatunek = gatunek;
		this.chromo = chromo;
		tab_ch = new Chromosom[chromo];
	}
	
	String rig(){
		return (rodzaj + " " + gatunek);
	}
	
	int chromo(){
		return chromo;
	}
	
	void all(){
		System.out.println(rig() + " liczba chromosomów: " + chromo());
		/*for(int i = 0; i < tab_ch.length; i++) {
			System.out.print("Nr chromosomu: " + tab_ch[i].nr_chromosomu);
			System.out.print(" D³ugoœæ ramion: " + tab_ch[i].dl_ramion);
			System.out.print(" P³eæ: " + tab_ch[i].plec);*/
		}
	
	void addChromo(){
		
	}
}
