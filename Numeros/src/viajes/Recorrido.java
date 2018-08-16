package viajes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import viajes.InterfCiudades.Ciudades;

public class Recorrido {
	

	public static Map <Vuelo, Boolean> vuelosPosibles;
	
	private Ciudades origen;
	private Ciudades destino;
	private Stack <Vuelo> pilaVuelos;
	private int distanciaTotal = 0;
	
	Recorrido(Ciudades origen, Ciudades destino){
		this.origen = origen;
		this.destino = destino;
	}
	
	boolean addVuelo(Vuelo vuelo){
		if (pilaVuelos.contains(vuelo)) {
			return false;
		}
		else {
			pilaVuelos.push(vuelo);
			distanciaTotal += vuelo.getDistancia();
			return true;
		}
	}
	
	void deleteVuelo() {
		distanciaTotal -= pilaVuelos.pop().getDistancia();
	}

	void generaCamino() {
		boolean destinoEncontrado = false;
		Ciudades origenActual = origen;
		while (!destinoEncontrado) {
			for (Vuelo vuelo:listaDestinos (origenActual)) {
				if (addVuelo (vuelo)) {
					origenActual = vuelo.getDestino().getDestino();
				}else {
					deleteVuelo();
					origenActual = pilaVuelos.peek().getOrigen().getOrigen();
				}
			}
		}
	}
	
	List <Vuelo> listaDestinos (Ciudades origen){
		List<Vuelo> lista = new ArrayList();
		for (Vuelo vuelo: vuelosPosibles.keySet()) {
			if (vuelo.getOrigen().getOrigen() == origen) {
				lista.add (vuelo);
			}
		}
		return lista;
	}
	
	// Getters & Setters
	
	public Stack<Vuelo> getCiudadesRecorridas() {
		return pilaVuelos;
	}

	public Ciudades getOrigen() {
		return origen;
	}

	public void setOrigen(Ciudades origen) {
		this.origen = origen;
	}

	public Ciudades getDestino() {
		return destino;
	}

	public void setDestino(Ciudades destino) {
		this.destino = destino;
	}

	static {
		vuelosPosibles = new HashMap<>();
		
		Vuelo vuelo01 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.MADRID), 
				new Destino(InterfCiudades.Ciudades.LONDRES), 
				1);
		Vuelo vuelo02 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.MADRID), 
				new Destino(InterfCiudades.Ciudades.PARIS), 
				2);
		Vuelo vuelo03 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.LONDRES), 
				new Destino(InterfCiudades.Ciudades.PARIS), 
				3);
		Vuelo vuelo04 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.LONDRES), 
				new Destino(InterfCiudades.Ciudades.BERLIN), 
				4);
		Vuelo vuelo05 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.PARIS), 
				new Destino(InterfCiudades.Ciudades.MADRID), 
				5);
		Vuelo vuelo06 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.PARIS), 
				new Destino(InterfCiudades.Ciudades.ROMA), 
				6);
		Vuelo vuelo07 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.ROMA), 
				new Destino(InterfCiudades.Ciudades.MADRID), 
				7);
		Vuelo vuelo08 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.ROMA), 
				new Destino(InterfCiudades.Ciudades.PARIS), 
				8);
		Vuelo vuelo09 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.BERLIN), 
				new Destino(InterfCiudades.Ciudades.ROMA), 
				9);
		Vuelo vuelo10 = new Vuelo(
				new Origen(InterfCiudades.Ciudades.BERLIN), 
				new Destino(InterfCiudades.Ciudades.PARIS), 
				10);
		
		vuelosPosibles.put(vuelo01, false);
		vuelosPosibles.put(vuelo02, false);
		vuelosPosibles.put(vuelo03, false);
		vuelosPosibles.put(vuelo04, false);
		vuelosPosibles.put(vuelo05, false);
		vuelosPosibles.put(vuelo06, false);
		vuelosPosibles.put(vuelo07, false);
		vuelosPosibles.put(vuelo08, false);
		vuelosPosibles.put(vuelo09, false);
		vuelosPosibles.put(vuelo10, false);
		}
	
}
