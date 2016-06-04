package CreationalPattern.BuilderPattern;

/*
 * 增加建造者之后，再增加导演ComputerDirector类
 */
public class ComputerDirector {
	ComputerBuilder builder;

	// 构造T410型计算机
	public T410 constructT410() {
		builder = new T410Builder();
		builder.buildCpu();
		builder.buildGraphicCard();
		return (T410) builder.getResult();
	}

	// 构造X201型计算机
	public X201 constructX201() {
		builder = new X201Builder();
		builder.buildCpu();
		return (X201) builder.getResult();
	}
}
