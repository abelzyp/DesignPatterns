package BehavioralPattern.StatePattern;

/*
 * 电视机类，对应状态模式中的环境角色
 */
public class TV {
	public final static Channel CCTV1 = new CCTV1();
	public final static Channel CCTV2 = new CCTV2();
	// 当前频道
	private Channel channel;

	// 设置频道
	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	// 播放CCTV1
	public void disCCTV1() {
		this.setChannel(CCTV1);
		this.channel.display();
	}

	// 播放CCTV2
	public void disCCTV2() {
		this.setChannel(CCTV2);
		this.channel.display();
	}
}
