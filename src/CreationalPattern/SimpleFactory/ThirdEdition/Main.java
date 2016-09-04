package CreationalPattern.SimpleFactory.ThirdEdition;

import java.util.Scanner;

/*
 * 第二个版本中的耦合还是紧，如果要增加别的运算，还需要修改Operator类，还需要改进，最终改成简单工厂模式
 */
public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数字：");
			String a = sc.nextLine();
			System.out.println("请选择运算符号(+ - * /)：");
			String oper = sc.nextLine();
			System.out.println("请输入第二个数字：");
			String b = sc.nextLine();

			Operation operation = OperationFactory.createOperate(oper);
			double result = operation.getResult(Double.parseDouble(a), Double.parseDouble(b));

			System.out.println("结果是：" + result);
		} catch (Exception e) {
			System.out.println("您的输入有误：" + e.getMessage());
		}
	}
}
