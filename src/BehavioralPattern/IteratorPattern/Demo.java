package BehavioralPattern.IteratorPattern;

/*
 * 迭代器模式：
 * 		提供一种方法访问一个容器中各个元素，而又不需暴露该对象的内部细节。
 * 		迭代器是为容器服务的。
 */
public class Demo {
	public static void main(String[] args) {
		// 定义聚集对象
		Aggregate agg = new ConcreteAggregate();
		agg.add("张三");
		agg.add("李思");
		agg.add("王五");
		// 遍历
		Iterator iterator = agg.creatIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
