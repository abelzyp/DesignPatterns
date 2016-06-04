package BehavioralPattern.ObserverPattern;

/*
 * Clickable接口对可单击控件的功能方法进行抽象
 */
public interface Clickable {
	public void click();

	// 添加单击事件的观察者
	public void addClickableObserver(ClickableObserver observer);

	// 移除单击事件的观察者
	public void removeClickableObserver(ClickableObserver observer);
}
