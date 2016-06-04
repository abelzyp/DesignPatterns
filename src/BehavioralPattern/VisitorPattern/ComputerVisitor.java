package BehavioralPattern.VisitorPattern;

/*
 * 代表对计算机硬件的访问者
 */
public interface ComputerVisitor {
	void visitCPU(CPU cpu);// 访问CPU

	void visitHarddisk(Harddisk harddisk);// 访问硬盘
}
