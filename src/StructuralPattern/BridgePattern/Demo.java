package StructuralPattern.BridgePattern;

/*
 * 桥梁模式：
 * 		将抽象和实现解耦，使得两者可以独立地变化。
 */
public class Demo {
	public static void main(String[] args) {
		HandsetBrand hb = new HandsetBrandA();
		hb.setHandsetSoft(new HandsetGame());
		hb.run();

		hb.setHandsetSoft(new HandsetAddressList());
		hb.run();

		hb = new HandsetBrandB();
		hb.setHandsetSoft(new HandsetGame());
		hb.run();

		hb.setHandsetSoft(new HandsetAddressList());
		hb.run();
	}
}
