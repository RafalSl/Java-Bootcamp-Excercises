package motohurt;

public class Testowa {

	public static void main(String[] args) {
		Tire opona1 = new Tire(2555, "Dêbica", "Najlepszy model", 15555, 19, 20);
		ExhaustPart rura = new ExhaustPart(1819, "Producent wydechów", "Tania rura", 155555, true);
		Wheel kolo1 = new Wheel(2543, "OZ", "Srebrne gwiazdki", 66555, 19, 20);
		Wheel kolo2 = new Wheel(2544, "OZ", "Z³ote gwiazdki", 66554, 19, 22);
		System.out.println("Opona1 " + String.valueOf(opona1.getId()) + " " + opona1.getProducent() + " " + opona1.getModel() + " " + String.valueOf(opona1.getSerialNo()) + " " + String.valueOf(opona1.getSize()) + " " + String.valueOf(opona1.getWidth()));
		System.out.println("rura " + String.valueOf(rura.getId()) + " " + rura.getProducent() + " " + rura.getModel() + " " + String.valueOf(rura.getSerialNo()) + " "  + rura.isEuroNorm());
		System.out.println("kolo1 " + String.valueOf(kolo1.getId()) + " " + kolo1.getProducent() + " " + kolo1.getModel() + " " + String.valueOf(kolo1.getSerialNo()) + " " + String.valueOf(kolo1.getSize()) + " " + String.valueOf(kolo1.getWidth()));
		System.out.println("kolo2 " + String.valueOf(kolo2.getId()) + " " + kolo2.getProducent() + " " + kolo2.getModel() + " " + String.valueOf(kolo2.getSerialNo()) + " " + String.valueOf(kolo2.getSize()) + " " + String.valueOf(kolo2.getWidth()));
	}
}
