package StructuralPattern.ProxyPattern;

/*
 * 真实主题角色：
 * 		该角色也被叫做委托角色、被代理角色，是业务逻辑的具体执行者
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "在打怪！");
	}

	@Override
	public void upGrade() {
		System.out.println(this.name + "成功升级！");
	}

}
