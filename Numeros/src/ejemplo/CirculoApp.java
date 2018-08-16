package ejemplo;

public class CirculoApp {
	public static void main(String[] args) {
		Circulo c = new Circulo();
		Circulo c1 = new Circulo(new Double(3));
		System.out.println(c.toString());
		c.Area();
		System.out.println(c1.toString());
		c1.Area();
	}
}
