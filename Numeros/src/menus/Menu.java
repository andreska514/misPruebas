package menus;

import java.text.DecimalFormat;

public class Menu {
	enum primero{
		SOPA(15.2f),ENSALADA,GARBANZOS;
		private final float precio;
		primero(){
			precio = 10.5f; // precio por defecto
		}
		primero(float precio){
			this.precio = precio;
		}
		float getPrecio() {
			return precio;
		}
	}
	enum segundo{CARNE(7.1f), PESCADO, POLLO;
		private final float precio;
		segundo(){
			precio = 5.5f;
		}
		segundo(float precio){
			this.precio = precio;
		}
		float getPrecio() {
			return precio;
		}
	}
	enum bebida{AGUA, REFRESCO(2.1f), VINO;
		private final float precio;
		bebida(){
			this.precio=1.5f;
		}
		bebida(float precio){
			this.precio = precio;
		}
		public float getPrecio() {
			return precio;
		}
	}
	enum postre{
		FLAN(2), ARROZ_LECHE, MACEDONIA, YOGURT, FRUTA;
		final float precio;
		postre(){
			precio = 1.1f; // precio por defecto
		}
		postre(float precio){
			this.precio= precio;
		}
		float getPrecio() {
			return precio;
		}
	}
	
	private primero miPrimero;
	private segundo miSegundo;
	private bebida miBebida;
	private postre miPostre;
	private float total=20;
	
	public static class Builder {
		Menu menu;
		Builder(){
			menu = new Menu();
		}
		
		Builder primero(Menu.primero primero) {
			menu.miPrimero = primero;
			menu.total += primero.getPrecio();
			return this;
		}
		
		Builder segundo(Menu.segundo segundo) {
			menu.miSegundo = segundo;
			menu.total += segundo.getPrecio();
			return this;
		}
		
		Builder bebida(Menu.bebida bebida) {
			menu.miBebida = bebida;
			menu.total += bebida.getPrecio();
			return this;
		}
		
		Builder postre(Menu.postre postre) {
			menu.miPostre = postre;
			menu.total += postre.getPrecio();
			return this;
		}
		
		Menu build() {
			return menu;
		}
	}

	@Override
	public String toString() {
		DecimalFormat f = new DecimalFormat("##.00");
		return "Menu [miPrimero=" + miPrimero + ", miSegundo=" + miSegundo + ", miBebida=" + miBebida + ", miPostre="
				+ miPostre + ", total=" + f.format(total) + "]";
	}

	
}
