package CreationalPattern.AbstractFactory.FourthEdition;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("在SQL Server中给Department表则更加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在SQL Server中根据ID得到Department表的一条记录");
		return null;
	}

}
