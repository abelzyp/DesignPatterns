package StructuralPattern.FlyweightPattern;

/*
 * 抽象享元角色：声明一个put()方法，该方法的参数是享元对象的外部状态。
 */
public interface Chesspiece {
	public abstract void put(int x, int y);// 落子
}
