package CreationalPattern.PrototypePattern;

import java.util.Random;

/*
 * 通过邮件的克隆群发演示原型模式
 * 原型模式：
 * 		用原型实例指定创建对象的种类，并通过复制这些原型实例创建新的对象。
 */
public class Demo {
	// 发送账单的数量
	private static int MAX_COUNT = 4;

	public static void main(String[] args) {
		int i = 0;
		Mail mail = new Mail("活动通知", "五一商场抽奖活动！");
		while (i < MAX_COUNT) {
			// 克隆邮件
			Mail cloneMail = mail.clone();
			// 每封邮件不同的地方
			cloneMail.setAppellation(getRandomString(5) + "先生/女士");
			cloneMail.setReceiver(getRandomString(5) + "@" + getRandomString(6) + ".com");
			// 发送邮件
			sendMail(cloneMail);
			i++;
		}
	}

	// 发送邮件
	public static void sendMail(Mail mail) {
		System.out.println(mail.getAppellation() + "\t标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver()
				+ "\t邮件内容：" + mail.getContxt());
	}

	// 获得指定长度的随机字符串
	public static String getRandomString(int strLen) {
		String source = "qwertyuiopasdfghjklzxcvbnm";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < strLen; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
