package BehavioralPattern.Mediator;

/*
 * 中介者模式：
 * 		用一个中介对象封装一系列对象的交互，中介者使各对象不需要显示地相互作用，
 * 		从而使其耦合松散，而且可以独立地改变它们之间的交互。
 */
public class Demo {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();

		USA usa = new USA(unsc);
		Iraq iraq = new Iraq(unsc);

		unsc.setUsa(usa);
		unsc.setIraq(iraq);

		usa.declare("不准研制核武器，否则发动战争。");
		iraq.declare("我们没有核武器，也不怕战争");
	}
}
