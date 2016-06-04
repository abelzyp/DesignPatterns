package BehavioralPattern.VisitorPattern;

/*
 * 计算机类，由CPU和硬盘组成，对应访问者模式中的结构对象角色
 */
public class Computer {
	private Hardware cpu;
	private Hardware harddisk;

	public Computer() {
		this.cpu = new CPU("Intel Core i7");
		this.harddisk = new Harddisk("Seagate 1T");
	}

	public void accept(ComputerVisitor computerVisitor) {
		cpu.accept(computerVisitor);
		harddisk.accept(computerVisitor);
	}
}
