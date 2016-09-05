package CreationalPattern.AbstractFactory.ThirdEdition;

/*
 * 抽象工厂模式：
 * 		提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 
 * 用工厂方法模式的数据库访问程序使得声明IUser接口的对象iu事先根本不知道是在访问哪个数据库，确实实现了业务逻辑与数据访问的解耦。
 * 但是问题并没有完全解决，数据库中不可能只有一个User表，很可能有其他表，比如增加部门表（Department表），此时需要更改。
 * 
 * 本例就已经改为了抽象工厂模式，最大的好处就是便于交换产品系列。
 * 由于具体工厂类，例如IFactory factory = new SqlServerFactory();在一个应用中只需要在初始化的时候出现一次，
 * 这就使得改变一个应用的具体工厂变得非常容易，只需要改变具体工厂即可使用不同的产品配置。
 * 
 * 并且，它让具体的创建实例的过程与客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名也被具体工厂的实现分离，不会出现在客户代码中。
 * 在这个例子中，客户端只认识IUser和IDepartment，至于它是用SQL Server还是Access实现，就不知道了。
 * 
 * 虽然抽象工厂模式可以很方便的切换两个数据库访问的代码，但是如果需求来自增加功能，比如现在要增加一个Project项目表，
 * 那就至少需要增加三个类，IProject、SQLserverProject、AccessProject，还需要更改IFactory、SqlserverFactory和AccessFactory才可以完全实现。
 */
public class Main {
	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		// 若更改成Access数据库，只需要将本句改成new AccessFactory();
		IFactory factory = new SqlServerFactory();
		IUser iu = factory.createUser();
		IDepartment id = factory.createDepartment();
		iu.Insert(user);
		iu.getUser(1);
		id.Insert(department);
		id.getDepartment(1);// 访问部门ID为1的部门
	}
}
