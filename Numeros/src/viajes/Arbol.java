package viajes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import viajes.InterfCiudades.Ciudades;

public class Arbol {
	
	private List <Recorrido> recorridos = new ArrayList();
	
	private Ciudades origenAbsoluto;
	private Ciudades destinoAbsoluto;
	
	public Arbol(Ciudades origenAbsoluto, Ciudades destinoAbsoluto) {
		super();
		this.origenAbsoluto = origenAbsoluto;
		this.destinoAbsoluto = destinoAbsoluto;
	}
	
	/*void generaRecorridos() {
		Recorrido recorrido;
		Ciudades origenActual = origenAbsoluto;
		boolean onProcess = true;
		boolean onRecorrido = true;
		while(onProcess) {
			recorrido = new Recorrido();
			while (onRecorrido) {
				for(Vuelo vuelo: listaDestinos(origenActual)) {
					recorrido.addVuelo(vuelo);
				}
				
				for (Vuelo vuelo:vuelosPosibles) {
					if(recorrido.addVuelo(vuelo));
				}
			}
			//addRecorrido(recorrido)
		}
	}*/
	
	void generaRecorrido() {
		Recorrido recorrido = new Recorrido(origenAbsoluto, destinoAbsoluto);
		
	}
	/*
	List <Vuelo> listaDestinos(Ciudades origen){
		List<Vuelo> lista = new ArrayList();
		for(Vuelo vuelo:vuelosPosibles) {
			if(vuelo.getOrigen().getOrigen() == origen) {
				lista.add(vuelo);
			}
		}
		return lista;
	}
	*/
	
	boolean destinoAlcanzado(Ciudades destino) {
		if(destinoAbsoluto.equals(destino))
			return true;
		else
			return false;
	}
	
	void addRecorrido (Recorrido recorrido) {
		recorridos.add (recorrido);
	}
	
	public List<Recorrido> getRecorridos() {
		return recorridos;
	}


	
}