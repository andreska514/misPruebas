package figuras;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo.Builder builder = new Circulo.Builder();
		Circulo c1 = builder
			.radio(1.0)
			.color("rojo")
			.escala(2.0)
			.textura("rugoso")
			.build();
		System.out.println(c1.toString());
	}
}
