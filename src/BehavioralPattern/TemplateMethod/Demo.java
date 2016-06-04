package BehavioralPattern.TemplateMethod;

/*
 * 模板方法模式：
 * 		定义一个操作中的算法的框架，而将一些步骤延迟到子类中。
 * 		使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 * 
 * 需求模板：计算一段代码运行的时间
 */
public class Demo {
	public static void main(String[] args) {
		GetTime gt = new ForCode();
		System.out.println("执行时间：" + gt.getTime() + "ms");

		gt = new WhileCode();
		System.out.println("执行时间：" + gt.getTime() + "ms");
	}
}
