package CreationalPattern.FactoryMethod;

/*
 * 抽象工厂角色：任何创建对象的工厂类必须实现这个接口。
 */
public interface Factory {
	public abstract Animal createAnimal();
}
