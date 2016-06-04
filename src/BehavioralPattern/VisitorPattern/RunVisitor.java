package BehavioralPattern.VisitorPattern;

/*
 * 使计算机硬件运转的访问者
 */
public class RunVisitor implements ComputerVisitor {

	@Override
	public void visitCPU(CPU cpu) {
		cpu.run();
	}

	@Override
	public void visitHarddisk(Harddisk harddisk) {
		harddisk.run();
	}

}
