package CreationalPattern.BuilderPattern;

public class X201 extends Computer {

	public X201() {
		this.setType("ThinkPad X201");
	}

	@Override
	public String toString() {
		return "型号：" + getType() + ",CPU:" + getCpu();
	}

}
