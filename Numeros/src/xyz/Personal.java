package xyz;

public abstract class Personal {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int aniosCompania;
	
	Personal(){}

	public Personal(String dni, String nombre, String apellidos, int aniosCompania) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.aniosCompania = aniosCompania;
	};
	
	protected abstract double calculaSueldo();

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getAniosCompania() {
		return aniosCompania;
	}

	protected void setAniosCompania(int aniosCompania) {
		this.aniosCompania = aniosCompania;
	}


	
	
}
