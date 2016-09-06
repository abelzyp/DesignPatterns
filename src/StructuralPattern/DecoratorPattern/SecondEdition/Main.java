package StructuralPattern.DecoratorPattern.SecondEdition;

/*
 * 如果要增加一个"超人"装扮，那第一版就得更改Person类的，违背了开放-封闭原则
 * 
 * 更改后Person类就和Finery类实现了分离
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("abel");
		Finery ts = new TShirts();
		Finery bt = new BigTrouser();
		ts.show();
		bt.show();
		person.show();
	}
}
