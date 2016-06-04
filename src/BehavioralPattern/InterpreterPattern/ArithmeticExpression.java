package BehavioralPattern.InterpreterPattern;

/*
 * 接口代表算术表达式，对应解释器模式中的抽象解释器角色
 */
public interface ArithmeticExpression {
	int interpret(Variables variables);
}
