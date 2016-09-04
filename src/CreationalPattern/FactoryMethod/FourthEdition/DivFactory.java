package CreationalPattern.FactoryMethod.FourthEdition;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new Div();
	}

}
