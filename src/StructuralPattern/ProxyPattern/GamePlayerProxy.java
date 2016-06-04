package StructuralPattern.ProxyPattern;

import java.util.Date;

/*
 * 代理主题角色：
 * 		也叫作委托类、代理类，该角色负责控制对真实主题的引用
 * 		负责在需要的时候创建或删除真实主题对象
 * 		并且在真实主题角色处理完毕前后做预处理和善后处理工作
 */
public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer player = null;

	// 通过代理类的构造函数传递被代理者
	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}

	// 记录打怪时间
	private void log() {
		System.out.println("打怪时间：" + new Date().toString());
	}

	@Override
	public void killBoss() {
		this.log();
		player.killBoss();
	}

	// 计算升级用时
	private void count() {
		System.out.println("用了好久...");
	}

	@Override
	public void upGrade() {
		this.count();
		player.upGrade();
	}

}
