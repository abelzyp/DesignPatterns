package CreationalPattern.PrototypePattern;

/*
 * Mail类实现Cloneable接口，并实现了clone()方法
 * 只有实现了clone()方法，在应用中才能对Mail进行克隆复制
 */
public class Mail implements Cloneable {
	private String receiver;// 收件人
	private String appellation;// 称谓
	private String subject;// 邮件标题
	private String contxt;// 邮件内容

	public Mail(String subject, String contxt) {
		this.subject = subject;
		this.contxt = contxt;
	}

	// 克隆方法
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}
}
