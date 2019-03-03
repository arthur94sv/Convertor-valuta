
public class Dolar implements Convertor {
	public static final double USD = 4.17;

	public void conversie(double x) {
		double rez = x / USD;
		System.out.printf("Conversie lei in dolari: %.2f\n", rez);
	}
}