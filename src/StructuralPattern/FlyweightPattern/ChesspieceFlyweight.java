package StructuralPattern.FlyweightPattern;

/*
 * 具体享元实现抽象享元接口
 */
public class ChesspieceFlyweight implements Chesspiece {
	private String color;

	public ChesspieceFlyweight(String color) {
		this.color = color;
	}

	@Override
	public void put(int x, int y) {
		System.out.println("在（" + x + "," + y + "）位置放了一个" + color + "子");
	}

}
