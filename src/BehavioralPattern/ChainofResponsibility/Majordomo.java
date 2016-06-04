package BehavioralPattern.ChainofResponsibility;

/*
 * 总监类同样继承Manager类
 */
public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if (request.getRequestType() == "请假" && request.getNumber() <= 5) {
			System.out.println(name + ":" + request.getRequestContent() + "，数量" + request.getNumber() + "，被批准");
		} else {
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}

}
