package BehavioralPattern.MementoPattern;

/*
 * 备忘录模式：
 * 		在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 		并在该对象之外保存这个状态。这样，以后就可以将该对象恢复到原先保存的状态。
 * 
 * 		使用备忘录模式模拟版本控制系统的工作过程
 */
public class Demo {
	public static void main(String[] args) {
		VersionControlSystem vcs = new VersionControlSystem();

		Document document = new Document();
		document.content = "内容1";
		document.otherContent = "其他内容1";
		System.out.println(document);
		vcs.add(document.save());// 保存备份

		document.content = "内容2";
		document.otherContent = "其他内容2";
		System.out.println(document);
		vcs.add(document.save());

		document.resume(vcs.get(1));// 回复版本1
		System.out.println(document);

		document.resume(vcs.getLastVersion());// 回复最新版本
		System.out.println(document);
	}
}
