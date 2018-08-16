package creational.abstract_factory;

public class FactoryRed implements AbstractFactory{

	@Override
	public Button createButton() {
		return new ButtonRed();
	}

}
