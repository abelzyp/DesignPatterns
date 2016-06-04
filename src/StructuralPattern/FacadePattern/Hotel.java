package StructuralPattern.FacadePattern;

/*
 * 子系统角色
 */
public class Hotel {
	public void reserve(int days) {
		System.out.println("订了" + days + "天的房间");
	}
}
