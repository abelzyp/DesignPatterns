package BehavioralPattern.InterpreterPattern;

/*
 * 解释器模式：
 * 		给定一门语言，定义它的文法的一种表示，并定义一个解释器，
 * 		该解释器使用该表示来解释语言中的句子。
 * 
 * 		使用解释器模式完成四则算术运算表达式的计算
 */
public class Demo {
	public static void main(String[] args) {
		Variables v = new Variables();

		Variable x = new Variable();
		Variable y = new Variable();
		Variable z = new Variable();

		v.put(x, 10);
		v.put(y, 20);
		v.put(z, 30);

		// 计算x*(y+z/x)-x
		ArithmeticExpression e = new Substract(new Multiply(x, new Plus(y, new Division(z, x))), x);
		System.out.println(e.interpret(v));// 220
	}
}
