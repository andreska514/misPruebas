package figuras;

public class Circulo {

	private Double radio = 1.0;
	private String color = "rojo";
	private String textura;
	private Double escala;
	private static final Double PI = 3.141592653589793;

	private Circulo() {
	}
	public Double obtenerArea() {
		return this.PI * (Math.pow(radio, 2));
	}

	public static class Builder {
		
		private Circulo circulo;
		
		public Builder() {
			this.circulo = new Circulo();			
		}
		
		public Builder radio(Double radio) {
			circulo.radio = radio;
			return this;
		}
		
		public Builder color(String color) {
			circulo.color = color;
			return this;
		}
		
		public Builder textura(String textura) {
			circulo.textura = textura;
			return this;
		}
		
		public Builder escala(Double escala) {
			circulo.escala = escala;
			return this;
		}
		
		public Circulo build() {
			return circulo;
		}
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + ", textura=" + textura + ", escala=" + escala + "]";
	}
	
	
	
}
