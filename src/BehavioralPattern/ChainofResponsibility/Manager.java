package BehavioralPattern.ChainofResponsibility;

/*
 * 管理者
 */
public abstract class Manager {
	protected String name;
	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	// 关键方法：设置管理者上级
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	// 申请请求
	public abstract void requestApplications(Request request);
}
