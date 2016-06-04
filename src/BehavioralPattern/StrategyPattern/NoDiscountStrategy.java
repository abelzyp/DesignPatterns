package BehavioralPattern.StrategyPattern;

/*
 * 具体策略角色：
 * 		该角色实现抽象策略中的具体操作，含有具体的算法。
 */
public class NoDiscountStrategy extends DiscountStrategy {

	public NoDiscountStrategy(double price, int number) {
		super(price, number);
	}

	// 实现策略方法，0折扣额
	@Override
	public double calculateDiscount() {
		return 0;
	}

}
