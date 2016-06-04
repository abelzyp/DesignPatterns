package CreationalPattern.BuilderPattern;

public class T410 extends Computer {
	private String graphicCard;// 显卡

	public T410() {
		this.setType("ThinkPad T410");
	}

	public String getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}

	@Override
	public String toString() {
		return "型号：" + getType() + ",CPU:" + getCpu() + ",显卡：" + getGraphicCard();
	}

}
