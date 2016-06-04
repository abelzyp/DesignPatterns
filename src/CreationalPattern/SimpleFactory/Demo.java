package CreationalPattern.SimpleFactory;

/*
 * 简单工厂模式：
 * 		一个工厂类处于对产品实例化的中心位置上，它知道每一个产品，
 * 		它决定哪一个产品类应当被实例化。
 */
public class Demo {
	public static void main(String[] args) {
		Animal animal = AnimalFactory.createAnimal("dog");
		animal.eat();

		animal = AnimalFactory.createAnimal("cat");
		animal.eat();
	}
}
