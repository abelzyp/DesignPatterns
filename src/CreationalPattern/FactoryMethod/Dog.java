package CreationalPattern.FactoryMethod;

/*
 * 具体产品角色：该角色实现抽象产品角色所声明的接口
 * 工厂方法模式所创建的每一个对象都是某个具体产品角色的实例。
 */
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

}
