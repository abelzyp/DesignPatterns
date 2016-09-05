package CreationalPattern.AbstractFactory.ThirdEdition;

/*
 * IFactory接口，定义一个创建访问User表对象的抽象的工厂接口
 * 
 * 增加一个一个创建访问Department表对象的抽象的工厂接口
 */
public interface IFactory {
	public abstract IUser createUser();

	public abstract IDepartment createDepartment();
}
