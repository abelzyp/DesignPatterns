package CreationalPattern.Singleton;

/*
 * 单例模式：
 * 		确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 */
public class CatDemo {
	public static void main(String[] args) {
		Cat c1 = Cat.getCat();
		Cat c2 = Cat.getCat();
		System.out.println(c1 == c2);
	}
}
