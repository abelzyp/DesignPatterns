package BehavioralPattern.VisitorPattern;

/*
 * 代表对计算机硬件型号的访问者
 */
public class TypeVisitor implements ComputerVisitor {

	@Override
	public void visitCPU(CPU cpu) {
		System.out.println("CPU型号：" + cpu.getType());
	}

	@Override
	public void visitHarddisk(Harddisk harddisk) {
		System.out.println("硬盘型号：" + harddisk.getType());
	}

}
