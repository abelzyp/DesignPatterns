package StructuralPattern.DecoratorPattern;

/*
 * 装饰角色：
 * 		该角色持有一个构件对象的实例，并定义一个与抽象构件接口相一致的接口。
 */
public abstract class PhoneDecorator implements Phone {
	private Phone phone = null;

	public PhoneDecorator(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void call() {
		this.phone.call();
	}

}
