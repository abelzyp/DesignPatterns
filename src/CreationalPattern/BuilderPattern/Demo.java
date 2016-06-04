package CreationalPattern.BuilderPattern;

/*
 * 建造者模式：
 * 		将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 
 * 		使用建造者模式完成计算机的生产
 */
public class Demo {
	public static void main(String[] args) {
		ComputerDirector director = new ComputerDirector();
		Computer t410 = director.constructT410();
		System.out.println(t410);

		Computer x201 = director.constructX201();
		System.out.println(x201);
	}
}
