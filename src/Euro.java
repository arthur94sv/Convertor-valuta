
public class Euro implements Convertor {
	public static final double EUR = 4.74;

	public void conversie(double x) {
		double rez = x / EUR;
		System.out.printf("Conversie lei in euro: %.2f\n", rez);

	}

}
