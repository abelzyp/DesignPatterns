package CreationalPattern.AbstractFactory.FirstEdition;

/*
 * 客户端代码
 */
public class Main {
	public static void main(String[] args) {
		User user = new User();
		SqlserverUser su = new SqlserverUser();

		su.Insert(user);
		su.getUser(1);// 得到ID为1的用户
	}
}
