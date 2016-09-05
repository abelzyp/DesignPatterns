package CreationalPattern.AbstractFactory.FourthEdition;

/*
 * 改进到ThirdEdition就已经是抽象工厂模式了，但是抽象工厂模式有缺点，
 * 这里FourthEdition改为简单工厂模式，没有好坏之分。
 * 
 * 这个版本去掉了IFactory、SqlserverFactory、AccessFactory三个工厂类，
 * 取而代之的是DataAccess类，用一个简单工厂模式实现。
 */
public class Main {
	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();

		IUser iu = DataAccess.createUser();
		iu.Insert(user);
		iu.getUser(1);

		IDepartment id = DataAccess.createDepartment();
		id.Insert(department);
		id.getDepartment(1);
	}
}
