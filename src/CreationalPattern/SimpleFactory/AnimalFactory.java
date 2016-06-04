package CreationalPattern.SimpleFactory;

/*
 * 工厂类处于对产品类实例化的中心位置上，它决定哪一个产品类应当被实例化。
 */
public class AnimalFactory {
	// 先把构造函数私有化，防止外界直接实例化
	private AnimalFactory() {
	}

	// 再提供static函数，让外界直接调用
	public static Animal createAnimal(String type) {
		if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cat")) {
			return new Cat();
		} else {
			return null;
		}
	}
}
