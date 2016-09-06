package StructuralPattern.DecoratorPattern.ThirdEdition;

/*
 * 改进为装饰模式
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("abel");
		TShirt ts = new TShirt();
		BigTrouser bt = new BigTrouser();
		ts.decorate(person);
		bt.decorate(ts);
		bt.show();
	}
}
