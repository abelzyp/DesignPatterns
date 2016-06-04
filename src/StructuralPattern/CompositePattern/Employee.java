package StructuralPattern.CompositePattern;

/*
 * 叶子节点
 */
public class Employee implements Company {
	private String name;
	private String position;
	private int salary;

	public Employee(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info + "\t职位：" + this.position;
		info = info + "\t薪水" + this.salary;
		return info;
	}

}
