package CreationalPattern.BuilderPattern;

/*
 * 抽象产品类
 */
public abstract class Computer {
	private String type;// 型号
	private String cpu;// CPU

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
