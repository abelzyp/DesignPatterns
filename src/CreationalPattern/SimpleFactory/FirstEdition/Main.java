package CreationalPattern.SimpleFactory.FirstEdition;

import java.util.Scanner;

/*
 * 实现计算器的功能
 */
public class Main {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数字：");
			String a = sc.nextLine();
			System.out.println("请选择运算符号(+ - * /)：");
			String oper = sc.nextLine();
			System.out.println("请输入第二个数字：");
			String b = sc.nextLine();

			String result = "";
			switch (oper) {
			case "+":
				result = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
				break;
			case "-":
				result = String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
				break;
			case "*":
				result = String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
				break;
			case "/":
				if (Integer.parseInt(b) != 0) {
					result = String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
				} else {
					result = "除数不能为0。";
				}
				break;
			}
			
			System.out.println("结果是：" + result);
		} catch (Exception e) {
			System.out.println("您的输入有误：" + e.getMessage());
		}
	}
}
