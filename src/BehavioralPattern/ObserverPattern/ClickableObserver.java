package BehavioralPattern.ObserverPattern;

/*
 * ClickableObserver接口代表可单击控件的单击事件观察者
 */
public interface ClickableObserver {
	// 发生单击事件时的操作
	public void clicked(Clickable clickable);
}
