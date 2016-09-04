package CreationalPattern.SimpleFactory.SecondEdition;

import java.util.Scanner;

/*
 * 运算的封装，应该把业务逻辑和界面逻辑分开
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

			double result = Operation.getResult(Double.parseDouble(a), Double.parseDouble(b), oper);

			System.out.println("结果是：" + result);
		} catch (Exception e) {
			System.out.println("您的输入有误：" + e.getMessage());
		}
	}
}
