package StructuralPattern.DecoratorPattern.FirstEdition;

/*
 * 穿衣搭配问题
 * 		现在要求写一个可以给人搭配不同的服饰的系统
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("abel");
		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();
	}
}
