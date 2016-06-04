package BehavioralPattern.StrategyPattern;

/*
 * 抽象折扣算法
 * 抽象策略角色：
 * 		该角色对策略、算法进行抽象，通常定义每个策略或算法必须具有的方法和属性。
 */
public abstract class DiscountStrategy {
	private double price = 0;// 书的价格
	private int number = 0;// 书的数量

	public DiscountStrategy(double price, int number) {
		this.price = price;
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// 策略方法，计算折扣额
	public abstract double calculateDiscount();
}
