package StructuralPattern.FacadePattern;

/*
 * 子系统角色
 */
public class Restaurant {
	public void reserve(int num) {
		System.out.println("定了一桌" + num + "个人的酒席");
	}
}
