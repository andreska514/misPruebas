package xyz;

public abstract class Productos {
	protected int id;
	protected String color;
	protected String nombre;
	
	public Productos (int id, String color, String nombre) {
		this.id = id;
		this.color = color;
		this.nombre = nombre;
	}
	
	public Productos() {}
	
}
