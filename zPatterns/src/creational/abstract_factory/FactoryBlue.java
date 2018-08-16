package creational.abstract_factory;

public class FactoryBlue implements AbstractFactory{

	@Override
	public Button createButton() {
		return new ButtonBlue();
	}

}
