package CreationalPattern.AbstractFactory.FirstEdition;

/*
 * SqlserverUser类，用于操作User表
 */
public class SqlserverUser {
	public void Insert(User user) {
		System.out.println("在SQL Server中给User表增加一条记录");
	}

	public User getUser(int id) {
		System.out.println("在SQL Server中根据ID得到User表的一条记录");
		return null;
	}
}
