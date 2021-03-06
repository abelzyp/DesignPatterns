package StructuralPattern.DecoratorPattern;

/*
 * 装饰模式：
 * 		动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 */
public class Demo {
	public static void main(String[] args) {
		Phone phone = new IPhone();
		PhoneDecorator musicPhone = new MusicPhoneDecorator(phone);
		PhoneDecorator musicMsgPhone = new MsgPhoneDecorator(musicPhone);
		musicMsgPhone.call();
		System.out.println("----------------");
		PhoneDecorator myPhone = new MsgPhoneDecorator(new MusicPhoneDecorator(new IPhone()));
		myPhone.call();
	}
}
