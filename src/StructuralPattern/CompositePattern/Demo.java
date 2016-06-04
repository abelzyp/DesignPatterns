package StructuralPattern.CompositePattern;

/*
 * 组合模式：
 * 		将对象组合成树形结构以表示“部分-整体”的层次结构
 * 		使得用户对单个对象和组合对象的使用具有一致性
 */
public class Demo {
	public static void main(String[] args) {
		// CEO
		ConcreteCompany root = new ConcreteCompany("张三", "CEO", 100000);
		// 部门经理
		ConcreteCompany developDep = new ConcreteCompany("李思", "研发部经理", 12000);
		ConcreteCompany salesDep = new ConcreteCompany("王五", "销售部经理", 11000);
		ConcreteCompany financeDep = new ConcreteCompany("赵六", "财务部经理", 10000);
		// 部门员工
		Employee e1 = new Employee("A", "研发部", 8000);
		Employee e2 = new Employee("B", "研发部", 7000);
		Employee e3 = new Employee("C", "研发部", 6000);
		Employee e4 = new Employee("D", "销售部", 5000);
		Employee e5 = new Employee("E", "销售部", 4000);
		Employee e6 = new Employee("F", "财务部", 3000);
		// 生成树
		root.add(developDep);
		root.add(salesDep);
		root.add(financeDep);
		developDep.add(e1);
		developDep.add(e2);
		developDep.add(e3);
		salesDep.add(e4);
		salesDep.add(e5);
		financeDep.add(e6);
		// 显示公司层次
		System.out.println(root.getInfo());
		display(root);
	}

	// 遍历树（递归）
	private static void display(ConcreteCompany root) {
		for (Company c : root.getChild()) {
			if (c instanceof Employee) {// 如果节点类型是叶子节点
				System.out.println(c.getInfo());
			} else {// 如果是树枝节点
				System.out.println("\n" + c.getInfo());
				display((ConcreteCompany) c);
			}
		}
	}
}
