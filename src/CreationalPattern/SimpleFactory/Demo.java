package CreationalPattern.SimpleFactory;

/*
 * 简单工厂模式：
 * 		一个工厂类处于对产品实例化的中心位置上，它知道每一个产品，
 * 		它决定哪一个产品类应当被实例化。
 * 
 * 		简单工厂模式最大的优点在于工厂类中包含了必要的逻辑判断，根据客户的选择条件动态实例化相关的类，
 * 		对于客户端来说，去除了与具体产品的依赖。
 */
public class Demo {
	public static void main(String[] args) {
		Animal animal = AnimalFactory.createAnimal("dog");
		animal.eat();

		animal = AnimalFactory.createAnimal("cat");
		animal.eat();
	}
}
