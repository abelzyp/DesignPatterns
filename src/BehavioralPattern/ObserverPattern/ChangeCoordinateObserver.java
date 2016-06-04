package BehavioralPattern.ObserverPattern;

/*
 * 修改按钮坐标的观察者
 */
public class ChangeCoordinateObserver implements ClickableObserver {

	@Override
	public void clicked(Clickable clickable) {
		Button button = (Button) clickable;
		button.x = 100;
		button.y = 90;
	}

}
