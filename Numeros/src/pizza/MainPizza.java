package pizza;

public class MainPizza {
	public static void main(String[] args) {
		
		System.out.println("\n * * * * INGREDIENTES * * * * ");
		for(InterfIngrediente ingre: Pizza.listaIngredientes()) {
			System.out.println(ingre.toString());
		}
		
		Pizza.PizzaBuilder build = new Pizza.PizzaBuilder();
		Pizza miPizza = build
				.buildIngrediente(Pizza.Masa.FINA)
				.buildIngrediente(Pizza.Ingredientes.JAMON)
				.buildIngrediente(Pizza.Ingredientes.PINHA)
				.buildIngrediente(Pizza.Quesos.BOLA)
				//.buildQueso(Pizza.Quesos.BOLA)
				.build();
		System.out.println(miPizza.toString());
		
		Pizza.PizzaBuilder build2 = new Pizza.PizzaBuilder();
		Pizza mi2aPizza = build2
				.buildIngrediente(Pizza.Masa.GRUESA)
				//.buildIngrediente(Pizza.Ingredientes.BARBACOA)
				.buildIngrediente(Pizza.Ingredientes.CARNE)
				.buildIngrediente(Pizza.Ingredientes.PEPERONI)
				.buildIngrediente(Pizza.Ingredientes.TOMATE)
				.buildIngrediente(Pizza.Ingredientes.BARBACOA)
				.buildIngrediente(Pizza.Quesos.CHEDDAR)
				.build();
		System.out.println(mi2aPizza.toString());
		
		Pizza.PizzaBuilder build3 = new Pizza.PizzaBuilder();
		Pizza miPizza3 = build3
				.buildIngrediente(Pizza.Masa.GRUESA)
				.buildIngrediente(Pizza.Quesos.CHEDDAR)
				// .buildIngrediente(Pizza.Quesos.CHEDDAR)
				.build();
		System.out.println(miPizza3.toString());

	}
	
}
