package StructuralPattern.ProxyPattern;

/*
 * 代理模式：
 * 		为其他对象提供一种代理以控制对这个对象的访问。
 * 
 * 通过游戏代练演示代理模式
 */
public class Demo {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("牛牪犇");
		IGamePlayer proxy = new GamePlayerProxy(player);
		proxy.killBoss();
		proxy.upGrade();
	}
}
