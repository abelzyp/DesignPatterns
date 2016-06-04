package BehavioralPattern.InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Variables {
	Map<Variable, Integer> v = new HashMap<>();

	public void put(Variable variable, int value) {
		v.put(variable, value);
	}

	public int get(Variable variable) {
		return v.get(variable);
	}
}
