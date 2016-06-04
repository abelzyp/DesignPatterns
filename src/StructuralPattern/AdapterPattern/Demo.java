package StructuralPattern.AdapterPattern;

/*
 * 适配器模式：
 * 		将一个类的接口变换成客户端所期待的另一种接口
 * 		从而使原本因接口不匹配而无法一起工作的两个类能够在一起工作。
 */
public class Demo {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		userDao.add();
	}
}
