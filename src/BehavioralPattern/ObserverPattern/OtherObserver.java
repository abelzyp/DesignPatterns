package BehavioralPattern.ObserverPattern;

/*
 * 其他业务操作的观察者
 */
public class OtherObserver implements ClickableObserver {

	@Override
	public void clicked(Clickable clickable) {
		System.out.println("执行其他操作...");
	}

}
