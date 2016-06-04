package BehavioralPattern.ChainofResponsibility;

/*
 * 责任链模式：
 * 		使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。
 * 		将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
 */
public class Demo {
	public static void main(String[] args) {
		CommenManager jingli = new CommenManager("经理张三");
		Majordomo zongjian = new Majordomo("总监李思");
		GeneralManager zongjingli = new GeneralManager("总经理王五");
		jingli.setSuperior(zongjian);
		zongjian.setSuperior(zongjingli);

		Request request1 = new Request();
		request1.setRequestType("请假");
		request1.setRequestContent("小菜请假");
		request1.setNumber(1);
		jingli.requestApplications(request1);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请长假");
		request2.setNumber(4);
		jingli.requestApplications(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("我想加薪");
		request3.setNumber(500);
		jingli.requestApplications(request3);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("我想加高薪");
		request4.setNumber(1000);
		jingli.requestApplications(request4);
	}
}
