package BehavioralPattern.ObserverPattern;

/*
 * 观察者模式：
 * 		定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，
 * 		则所有依赖于它的对象都会得到通知并被自动更新。
 * 
 * 		使用观察者模式模拟按钮控件的事件处理机制
 */
public class Demo {
	public static void main(String[] args) {
		Button button = new Button();
		button.color = "白色";
		button.x = 0;
		button.y = 0;

		button.addClickableObserver(new ChangeColorObserver());
		button.addClickableObserver(new ChangeCoordinateObserver());
		button.addClickableObserver(new OtherObserver());

		button.click();
		System.out.println(button);
	}
}
