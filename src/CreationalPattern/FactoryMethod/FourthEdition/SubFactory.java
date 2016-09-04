package CreationalPattern.FactoryMethod.FourthEdition;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new Sub();
	}

}
