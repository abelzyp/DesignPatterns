package CreationalPattern.SimpleFactory.SecondEdition;

/*
 * 把计算功能抽取出来
 */
public class Operation {
	public static double getResult(double a, double b, String operate) {
		double result = 0;
		switch (operate) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		}
		return result;
	}
}
