package CreationalPattern.FactoryMethod.FourthEdition;

import java.util.Scanner;

/*
 * 为何叫FourthEdition，
 * 		是因为这个代码延续了简单工厂模式(SimpleFactory)的ThirdEdition。
 */
public class Main {
	public static void main(String[] args) {
		try {
			IFactory operFactory = new AddFactory();// 修改运算，只需要修改这里就可以了
			Operation oper = operFactory.createOperation();

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数字：");
			String a = sc.nextLine();
			// System.out.println("请选择运算符号(+ - * /)：");
			// String oper = sc.nextLine();
			System.out.println("请输入第二个数字：");
			String b = sc.nextLine();

			double result = oper.getResult(Double.parseDouble(a), Double.parseDouble(b));
			System.out.println("结果是：" + result);
		} catch (Exception e) {
			System.out.println("您的输入有误：" + e.getMessage());
		}
	}
}
