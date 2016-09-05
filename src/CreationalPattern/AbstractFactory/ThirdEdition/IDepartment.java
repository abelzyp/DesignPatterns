package CreationalPattern.AbstractFactory.ThirdEdition;

/*
 * IDepartment接口，用于客户端访问，解除与具体数据库访问的耦合。
 * 用来操作Department表(就是那个Department类)
 */
public interface IDepartment {
	public abstract void Insert(Department department);

	public abstract Department getDepartment(int id);
}
