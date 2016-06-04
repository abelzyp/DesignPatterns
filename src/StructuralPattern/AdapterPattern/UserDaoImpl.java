package StructuralPattern.AdapterPattern;

/*
 * 如果直接实现UserDao接口，则必须Override其所有的方法
 * 但我只用到的add方法，所以在中间增加一层适配器，再继承适配器，就可以只实现add方法了
 */
public class UserDaoImpl extends UserAdapter {
	@Override
	public void add() {
		System.out.println("只有添加功能");
	}
}
