package viajes;

public class Origen implements InterfCiudades{
	
	private Ciudades origen;

	public Origen(Ciudades origen) {
		super();
		this.origen = origen;
	}

	public Ciudades getOrigen() {
		return origen;
	}

	public void setOrigen(Ciudades origen) {
		this.origen = origen;
	}
	
	
}
