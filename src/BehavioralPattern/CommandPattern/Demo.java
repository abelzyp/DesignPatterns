package BehavioralPattern.CommandPattern;

/*
 * 命令模式：
 * 		将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，
 * 		对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 */
public class Demo {
	public static void main(String[] args) {
		// 开店前的准备
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();

		// 开门营业
		girl.setOrder(bakeMuttonCommand);
		girl.notifyOrder();
		girl.setOrder(bakeChickenWingCommand);
		girl.notifyOrder();
	}
}
