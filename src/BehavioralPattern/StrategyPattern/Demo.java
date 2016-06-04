package BehavioralPattern.StrategyPattern;

/*
 * 策略模式：
 * 		定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。
 * 		其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，
 * 		从而使得它们可以相互替换，使得算法可以在不影响客户端的情况下发生变化。
 */
public class Demo {
	private DiscountStrategy ds;

	public Demo(DiscountStrategy ds) {
		this.ds = ds;
	}

	// 调用策略模式，计算折扣额
	public double contextCalDisc() {
		return ds.calculateDiscount();
	}

	public static void main(String[] args) {
		Demo NoDiscount = new Demo(new NoDiscountStrategy(48.5, 20));
		System.out.println("0折扣：" + NoDiscount.contextCalDisc());

		Demo percentageDiscount = new Demo(new PercentageDiscountStrategy(38, 40));
		System.out.println("15%折扣：" + percentageDiscount.contextCalDisc());
	}
}
