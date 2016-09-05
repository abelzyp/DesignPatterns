package CreationalPattern.AbstractFactory.SecondEdition;

public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlserverUser();
	}

}
