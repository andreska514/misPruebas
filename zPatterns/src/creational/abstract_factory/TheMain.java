package creational.abstract_factory;

public class TheMain {
	public static void main(String[] args) {
		AbstractFactory absf = null;
		Button button = absf.createButton();
	}
	public static AbstractFactory createSpecificButton(String s) {
		if(s.equalsIgnoreCase("red"))
			return new FactoryRed();
		else 
			return new FactoryBlue();
	}
}
