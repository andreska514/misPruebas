package viajes;

public class Destino implements InterfCiudades{
	
	private Ciudades destino;
	
	public Destino(Ciudades destino) {
		super();
		this.destino = destino;
	}
	
	public Ciudades getDestino() {
		return destino;
	}
	public void setDestino(Ciudades destino) {
		this.destino = destino;
	}
}
