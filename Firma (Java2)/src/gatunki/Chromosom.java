package gatunki;

public class Chromosom {
	int nr_chromosomu = 0, dl_ramion = 0;
	boolean plec;
	
	Chromosom(int nr_chromosomu, int dl_ramion){
		if (nr_chromosomu > 0) this.nr_chromosomu = nr_chromosomu;
		if (dl_ramion >= 0) this.dl_ramion = dl_ramion;
		plec = false;
	}
	
	Chromosom(int nr_chromosomu, int dl_ramion, boolean plec){
		this(nr_chromosomu, dl_ramion);
		this.plec = plec;
	}
}
