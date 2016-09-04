package CreationalPattern.SimpleFactory.ThirdEdition;

/*
 * 增加一个简单运算工厂类
 */
public class OperationFactory {
	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new Add();
			break;
		case "-":
			oper = new Sub();
			break;
		case "*":
			oper = new Mul();
			break;
		case "/":
			oper = new Div();
			break;
		}
		return oper;
	}
}
