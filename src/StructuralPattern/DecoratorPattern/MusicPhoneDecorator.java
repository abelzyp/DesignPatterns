package StructuralPattern.DecoratorPattern;

public class MusicPhoneDecorator extends PhoneDecorator {

	public MusicPhoneDecorator(Phone phone) {
		super(phone);
	}

	// 定义自己的方法
	private void music() {
		System.out.println("手机可以听音乐");
	}

	// 重写call方法
	@Override
	public void call() {
		super.call();
		this.music();
	}
}
