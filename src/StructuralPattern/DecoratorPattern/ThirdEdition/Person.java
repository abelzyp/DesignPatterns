package StructuralPattern.DecoratorPattern.ThirdEdition;

/*
 * Person类，属于ConcreteComponent
 */
public class Person {
	public Person() {
	}

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("装饰的" + this.name);
	}
}
