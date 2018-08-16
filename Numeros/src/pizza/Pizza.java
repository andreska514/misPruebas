package pizza;

import java.util.ArrayList;
import java.util.List;

import figuras.Circulo.Builder;
import pizza.Pizza.Ingredientes;

public class Pizza {
	
	private List<InterfIngrediente> misIngredientes= new ArrayList<InterfIngrediente>();
	//private Masa masa;
	
	public enum Quesos implements InterfIngrediente{
		MANCHEGO,CHEDDAR,BOLA,FETA;
	}
	
	public enum Masa implements InterfIngrediente{
		GRUESA,FINA;
	}
	
	public enum Ingredientes implements InterfIngrediente{
		PINHA,CHAMPINHONES,CARNE,SETA,AGUACATE,PEPERONI,BARBACOA,JAMON,TOMATE;
	}
	
	static List<InterfIngrediente> listaIngredientes() {
		List<InterfIngrediente> lista = new ArrayList<InterfIngrediente>();
		for (Ingredientes i : Ingredientes.values()) {
			lista.add(i);
		}
		for (Quesos q : Quesos.values()) {
			lista.add(q);
		}
		for (Masa m : Masa.values()) {
			lista.add(m);
		}
		return lista;
	}
	
	@Override
	public String toString() {
		return "Pizza [misIngredientes=" + misIngredientes + "]";
	}
	
	/*
	 * sin repetir ingredientes -- ok 
	 * queso 0 o 1, 
	 * masa 1
	 *  * * * * * * * * * * * Builder * * * * * * * * * * * */
	
	public static class PizzaBuilder {
		private Pizza pizza;
		private int cantQuesos = 0;
		private int cantMasa = 0;
		
		public PizzaBuilder() {
			this.pizza = new Pizza();
		}

		public PizzaBuilder buildIngrediente(InterfIngrediente ingrediente) {
			if (ingrediente instanceof Pizza.Quesos) {
				cantQuesos++;
				if(cantQuesos>1) {
					throw new IllegalArgumentException("Solo se puede 1 tipo de queso!");
				}
			}
			if (ingrediente instanceof Pizza.Masa) {
				cantMasa++;
				if(cantMasa>1) {
					throw new IllegalArgumentException("Solo se puede 1 tipo de masa!");
				}
			}
			for(InterfIngrediente ing : pizza.misIngredientes) {
				if (ing.toString().equals(ingrediente.toString())) {
					throw new IllegalArgumentException("ingrediente repetido: "+ingrediente.toString());
				}
			}
			pizza.misIngredientes.add(ingrediente);
			return this;
		}
		
		public Pizza build() {
			
			if(pizza.misIngredientes.size()==0) {
				throw new IllegalArgumentException("No hay ingredientes");
			}
			
			if (cantMasa==0) {
				throw new IllegalArgumentException("Falta la masa!");
			}
			
			if(cantQuesos == 0) {
				throw new IllegalArgumentException("No hay ningún tipo de queso!");
			}
			
			return pizza;
		}
	}

	
}
