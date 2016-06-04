package StructuralPattern.AdapterPattern;

/*
 * 对用户的操作有增删改查四种操作
 */
public interface UserDao {
	public abstract void add();

	public abstract void delete();

	public abstract void update();

	public abstract void find();
}
