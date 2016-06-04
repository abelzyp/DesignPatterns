package CreationalPattern.BuilderPattern;

public class X201Builder implements ComputerBuilder {
	private X201 computer = new X201();

	@Override
	public void buildCpu() {
		computer.setCpu("Core i3");
	}

	@Override
	public void buildGraphicCard() {
		// 无显卡
	}

	@Override
	public Computer getResult() {
		return computer;
	}
}
