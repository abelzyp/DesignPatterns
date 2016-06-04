package CreationalPattern.FactoryMethod;

/*
 * 具体工厂角色：实现了抽象工厂接口
 */
public class DogFactory implements Factory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
