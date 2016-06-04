package StructuralPattern.FacadePattern;

/*
 * 外观模式：
 * 		要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。
 * 		外观模式提供一个高层次的接口，使得子系统更易使用。
 * 
 * 		使用外观模式模拟秘书为老板安排工作的过程。
 */
public class Demo {
	// 老板
	public static void main(String[] args) {
		Secretary s = new Secretary();
		s.bookEat(3);
		s.bookSleep(2);
	}
}
