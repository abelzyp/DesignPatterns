package StructuralPattern.BridgePattern;

/*
 * 手机品牌类
 */
public abstract class HandsetBrand {
	protected HandsetSoft soft;

	// 品牌需要关注软件，在机器中安装软件，以备运行
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft = soft;
	}

	// 运行
	public abstract void run();
}
