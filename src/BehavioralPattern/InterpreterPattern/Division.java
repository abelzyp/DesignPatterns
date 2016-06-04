package BehavioralPattern.InterpreterPattern;

public class Division implements ArithmeticExpression {
	ArithmeticExpression left;
	ArithmeticExpression right;

	public Division(ArithmeticExpression left, ArithmeticExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Variables variables) {
		return left.interpret(variables) / right.interpret(variables);
	}
}
