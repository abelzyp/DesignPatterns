package BehavioralPattern.VisitorPattern;

/*
 * 硬盘类也继承自Hardware抽象类
 */
public class Harddisk extends Hardware {

	public Harddisk(String type) {
		super(type);
	}

	@Override
	public void run() {
		System.out.println("型号为：" + type + "的硬盘正在运转");
	}

	@Override
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visitHarddisk(this);
	}

}
