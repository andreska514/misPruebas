package viajes;

public class Vuelo {

	private Origen origen;
	private Destino destino;
	private int distancia;
	
	public Vuelo(Origen origen, Destino destino, int distancia) {
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}
	
	public Origen getOrigen() {
		return origen;
	}
	public void setOrigen(Origen origen) {
		this.origen = origen;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	
}
