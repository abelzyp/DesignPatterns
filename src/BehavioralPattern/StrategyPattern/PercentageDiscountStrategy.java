package BehavioralPattern.StrategyPattern;

/*
 * 具体策略角色：
 * 		该角色实现抽象策略中的具体操作，含有具体的算法。
 */
public class PercentageDiscountStrategy extends DiscountStrategy {

	public PercentageDiscountStrategy(double price, int number) {
		super(price, number);
	}

	// 策略方法，百分比为15%的折扣额
	@Override
	public double calculateDiscount() {
		return getNumber() * getPrice() * 0.15;
	}

}
