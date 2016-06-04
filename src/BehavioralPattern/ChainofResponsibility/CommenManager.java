package BehavioralPattern.ChainofResponsibility;

/*
 * 经理类直接继承Manager类，只需重写requestApplications方法即可
 */
public class CommenManager extends Manager {

	public CommenManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if (request.getRequestType() == "请假" && request.getNumber() <= 2) {
			System.out.println(name + ":" + request.getRequestContent() + "，数量" + request.getNumber() + "，被批准");
		} else {
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}

}
