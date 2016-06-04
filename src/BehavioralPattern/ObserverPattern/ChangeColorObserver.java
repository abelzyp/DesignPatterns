package BehavioralPattern.ObserverPattern;

/*
 * 修改按钮颜色的观察者
 */
public class ChangeColorObserver implements ClickableObserver {

	@Override
	public void clicked(Clickable clickable) {
		Button button = (Button) clickable;
		button.color = "红色";
	}

}
