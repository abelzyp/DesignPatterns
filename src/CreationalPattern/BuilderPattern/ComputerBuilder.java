package CreationalPattern.BuilderPattern;

public interface ComputerBuilder {
	public abstract void buildCpu();

	public abstract void buildGraphicCard();

	public abstract Computer getResult();// 得到建造好的计算机
}
