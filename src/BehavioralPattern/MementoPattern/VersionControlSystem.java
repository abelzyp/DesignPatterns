package BehavioralPattern.MementoPattern;
/*
 * 版本控制系统
 */

import java.util.LinkedList;

public class VersionControlSystem {
	LinkedList<Backup> backups = new LinkedList<>();// 所有的备份
	int nextVersion;// 下一个版本
	// 添加备份

	public void add(Backup backup) {
		backup.version = ++nextVersion;
		backups.add(backup);
	}

	// 取得某个版本的备份
	public Backup get(int version) {
		for (Backup backup : backups)
			if (backup.version == version)
				return backup;
		return null;
	}

	// 取得最后一个版本的备份
	public Backup getLastVersion() {
		return backups.getLast();
	}
}
