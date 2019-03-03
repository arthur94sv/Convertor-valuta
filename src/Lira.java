
public class Lira implements Convertor {
	public static final double GBP = 5.52;

	public void conversie(double x) {
		double rez = x / GBP;
		System.out.printf("Conversie lei in lire sterline: %.2f\n", rez);
	}

}
