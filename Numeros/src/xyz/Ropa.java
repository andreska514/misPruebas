package xyz;

public class Ropa extends Productos {
	
	private int talla;
	private int stock;
	public Ropa(int talla, int stock) {
		this.talla = talla;
		this.stock = stock;
	}
	
	public Ropa (int talla, int stock, int id, String color, String name) {
		super (id, color, name);
		this.talla = talla;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", stock=" + stock + ", id=" + id + ", color=" + color + ", nombre=" + nombre
				+ "]";
	}
	
	
}
