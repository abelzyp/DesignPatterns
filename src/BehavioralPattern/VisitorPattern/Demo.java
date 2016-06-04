package BehavioralPattern.VisitorPattern;

/*
 * 访问者模式：
 * 		封装一些作用于某种数据结构中的各元素的操作
 * 		它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
 */
public class Demo {
	public static void main(String[] args) {
		Computer computer = new Computer();

		ComputerVisitor typeVisitor = new TypeVisitor();
		ComputerVisitor runVisitor = new RunVisitor();

		computer.accept(typeVisitor);
		System.out.println("-----");
		computer.accept(runVisitor);
	}
}
