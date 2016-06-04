package BehavioralPattern.VisitorPattern;

/*
 * 抽象类代表计算机的各种硬件，对应访问模式中的抽象元素角色
 */
public abstract class Hardware {
	String type;// 型号

	public Hardware(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 运转
	public abstract void run();

	// 接收计算机访问者
	public abstract void accept(ComputerVisitor computerVisitor);
}
