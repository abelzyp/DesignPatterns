package CreationalPattern.BuilderPattern;

public class T410Builder implements ComputerBuilder {
	private T410 computer = new T410();

	@Override
	public void buildCpu() {
		computer.setCpu("Core i5");
	}

	@Override
	public void buildGraphicCard() {
		computer.setGraphicCard("Nvidia NVS 3100M");
	}

	@Override
	public Computer getResult() {
		return computer;
	}
}
