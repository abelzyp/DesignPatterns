package StructuralPattern.FlyweightPattern;

/*
 * 享元模式：
 * 		使用共享对象可以有效地支持大量的细粒度的对象。
 * 		
 * 		享元模式是以共享的方式高效的支持大量的细粒度对象。
 * 		享元对象能做到共享的关键是区分内部状态和外部状态。
 */
public class Demo {
	public static void main(String[] args) {
		Chesspiece p1 = ChesspieceFactory.getChesspiece("黑");
		p1.put(1, 1);
		Chesspiece p2 = ChesspieceFactory.getChesspiece("白");
		p2.put(2, 2);
		Chesspiece p3 = ChesspieceFactory.getChesspiece("黑");
		p3.put(3, 3);
		Chesspiece p4 = ChesspieceFactory.getChesspiece("白");
		p4.put(4, 4);
	}
}
