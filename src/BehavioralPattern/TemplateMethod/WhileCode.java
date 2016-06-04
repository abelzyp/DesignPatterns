package BehavioralPattern.TemplateMethod;

public class WhileCode extends GetTime {

	@Override
	public void code() {
		int i = 10000;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

}
