package CreationalPattern.AbstractFactory.ThirdEdition;

public class AccessDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("在Access中给Department表则更加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在Access中根据ID得到Department表的一条记录");
		return null;
	}

}
