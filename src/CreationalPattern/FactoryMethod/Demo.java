package CreationalPattern.FactoryMethod;

/*
 * 工厂方法模式：
 * 		定义一个创建产品对象的工厂接口，将实际创建性工作推迟到子类中。
 * 		核心的工厂类不再负责所有产品的创建，而是将具体的创建工作交给子类去做，
 * 		这个核心类则成为一个抽象工厂角色，仅负责给出具体工厂子类必须实现的接口。
 * 		这样可以用来允许系统在不修改具体工厂角色的情况下引进新的产品。
 */
public class Demo {
	public static void main(String[] args) {
		Factory factory = new DogFactory();
		Animal animal = factory.createAnimal();
		animal.eat();
	}
}
