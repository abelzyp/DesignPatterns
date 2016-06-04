package BehavioralPattern.MementoPattern;

/*
 * 需要被纳入版本控制系统的文档
 */
public class Document {
	String content;// 需要备份的状态
	String otherContent;// 不需要备份的状态

	// 保存为一个备份
	public Backup save() {
		System.out.println("保存备份");
		return new Backup(content);
	}

	// 恢复为某个状态
	public void resume(Backup backup) {
		System.out.println("恢复备份");
		content = backup.content;
	}

	@Override
	public String toString() {
		return "content：" + content + ",otherContent：" + otherContent;
	}
}
