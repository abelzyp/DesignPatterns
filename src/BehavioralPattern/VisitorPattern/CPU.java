package BehavioralPattern.VisitorPattern;

/*
 * CPU类继承Hardware抽象类
 */
public class CPU extends Hardware {

	public CPU(String type) {
		super(type);
	}

	@Override
	public void run() {
		System.out.println("型号为：" + type + "的CPU正在运转");
	}

	@Override
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visitCPU(this);
	}

}
