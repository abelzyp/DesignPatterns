package CreationalPattern.FactoryMethod.FourthEdition;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new Mul();
	}

}
