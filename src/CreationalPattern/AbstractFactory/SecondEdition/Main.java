package CreationalPattern.AbstractFactory.SecondEdition;

/*
 * 用工厂方法模式的数据库访问程序
 */
public class Main {
	public static void main(String[] args) {
		User user = new User();

		// 若更改成Access数据库，只需要将本句改成new AccessFactory();
		IFactory factory = new SqlServerFactory();
		IUser iu = factory.createUser();
		iu.Insert(user);
		iu.getUser(1);
	}
}
