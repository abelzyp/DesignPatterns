package StructuralPattern.DecoratorPattern;

public class MsgPhoneDecorator extends PhoneDecorator {

	public MsgPhoneDecorator(Phone phone) {
		super(phone);
	}

	// 定义自己的发短信方法
	private void sendMsg() {
		System.out.println("手机可以发短信了");
	}

	@Override
	public void call() {
		super.call();
		this.sendMsg();
	}

}
