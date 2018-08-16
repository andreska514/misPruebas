package menus;

public class MainMenu {
	public static void main(String[] args) {
		Menu.Builder builder = new Menu.Builder();
		Menu menu1 = builder
				.primero(Menu.primero.SOPA)
				.segundo(Menu.segundo.CARNE)
				.postre(Menu.postre.ARROZ_LECHE)
				.build();
		System.out.println(menu1.toString());
		
		Menu menu2 = builder
				.primero(Menu.primero.GARBANZOS)
				.segundo(Menu.segundo.CARNE)			
				.bebida(Menu.bebida.REFRESCO)
				.postre(Menu.postre.ARROZ_LECHE)
				.build();
		System.out.println(menu2.toString());
	}
}
