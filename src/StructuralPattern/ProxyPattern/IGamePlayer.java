package StructuralPattern.ProxyPattern;

/*
 * 抽象主题角色：
 * 		该角色是真实主题和代理主题的共同接口
 * 		以便在任何可以使用真实主题的地方都可以使用代理主题
 */
public interface IGamePlayer {
	public void killBoss();

	public void upGrade();
}
