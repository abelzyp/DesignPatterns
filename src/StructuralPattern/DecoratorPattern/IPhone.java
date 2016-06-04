package StructuralPattern.DecoratorPattern;

/*
 * 具体构件角色
 */
public class IPhone implements Phone {
	// 电话最原始的功能，只能打电话
	@Override
	public void call() {
		System.out.println("打电话功能");
	}

}
