package ejemplo;

public class Circulo {
	
	double radio = 1.0;
	String color = "rojo";
	String textura = "liso";
	float escala = 2f;
	
	public Circulo (){
		
	}
	public Circulo (double radio){
		this.radio = radio;
	}
	
	public Circulo(double radio, String color) {
		super();
		this.radio = radio;
		this.color = color;
	}
	
	public Circulo(double radio, String color, String textura) {
		super();
		this.radio = radio;
		this.color = color;
		this.textura = textura;
	}
	public Circulo(double radio, String color, String textura, float escala) {
		super();
		this.radio = radio;
		this.color = color;
		this.textura = textura;
		this.escala = escala;
	}
	public void Area() {
		System.out.println("Area: "+radio*radio*Math.PI);
	}
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + ", textura=" + textura + ", escala=" + escala + "]";
	}
	
}
