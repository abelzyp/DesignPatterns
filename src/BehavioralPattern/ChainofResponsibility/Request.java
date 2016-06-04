package BehavioralPattern.ChainofResponsibility;

/*
 * 申请类：申请类别、申请内容、申请数量
 */
public class Request {
	private String requestType;
	private String requestContent;
	private int number;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
