package BehavioralPattern.InterpreterPattern;

public class Substract implements ArithmeticExpression {
	ArithmeticExpression left;
	ArithmeticExpression right;

	public Substract(ArithmeticExpression left, ArithmeticExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Variables variables) {
		return left.interpret(variables) - right.interpret(variables);
	}

}
