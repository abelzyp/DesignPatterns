package StructuralPattern.DecoratorPattern.ThirdEdition;

public class TShirt extends Finery {
	@Override
	public void show() {
		System.out.println("大T恤");
		super.show();
	}
}
