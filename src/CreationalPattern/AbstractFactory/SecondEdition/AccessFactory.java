package CreationalPattern.AbstractFactory.SecondEdition;

public class AccessFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

}
