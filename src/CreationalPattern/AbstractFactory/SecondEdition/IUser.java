package CreationalPattern.AbstractFactory.SecondEdition;

/*
 * IUser接口，用于客户端访问，解除与具体数据库访问的耦合
 */
public interface IUser {
	public abstract void Insert(User user);

	public abstract User getUser(int id);
}
