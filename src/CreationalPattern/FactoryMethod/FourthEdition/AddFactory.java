package CreationalPattern.FactoryMethod.FourthEdition;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new Add();
	}

}
