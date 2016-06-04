package BehavioralPattern.InterpreterPattern;

public class Plus implements ArithmeticExpression {
	ArithmeticExpression left;
	ArithmeticExpression right;

	public Plus(ArithmeticExpression left, ArithmeticExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Variables variables) {
		return left.interpret(variables) + right.interpret(variables);
	}

}
