package BehavioralPattern.InterpreterPattern;

public class Variable implements ArithmeticExpression {

	@Override
	public int interpret(Variables variables) {
		return variables.get(this);
	}

}
