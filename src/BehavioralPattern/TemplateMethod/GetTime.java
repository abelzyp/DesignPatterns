package BehavioralPattern.TemplateMethod;

/*
 * 抽象模板方法：
 * 		定义一个或多个抽象操作，以便让子类实现
 * 		这些抽象操作是基本操作，是一个顶级逻辑的组成步骤。
 * 		还需定义并实现一个或几个模板方法，这些模板方法一般是具体方法
 */
public abstract class GetTime {
	public long getTime() {
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	// 要计算时间的方法，延迟到子类中执行
	// 这里定义抽象方法，
	// 如果方法抽象，则类必须抽象
	// 类的抽象方法，子类继承时必须重写其抽象方法
	public abstract void code();
}
