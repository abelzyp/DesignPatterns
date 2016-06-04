package BehavioralPattern.MementoPattern;

/*
 * 版本控制系统中保存的每个备份
 */
public class Backup {
	String content;// 备份的内容
	int version;// 版本

	public Backup(String content) {
		this.content = content;
	}

}
