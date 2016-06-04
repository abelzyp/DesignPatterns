package BehavioralPattern.StatePattern;

/*
 * 状态模式：
 * 		当一个对象内在状态改变时允许改变行为，这个对象看起来像改变了其类型。
 * 
 * 		使用状态模式模拟电视频道的切换过程
 */
public class Demo {
	public static void main(String[] args) {
		TV tv = new TV();
		// 换台
		tv.disCCTV1();
		tv.disCCTV2();
	}
}
