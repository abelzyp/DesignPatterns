package CreationalPattern.Singleton;

/*
 * 饿汉式：类加载时，就进行对象实例化
 */
public class Dog {
	// private：外界无法直接访问修改这个值
	// static：静态方法只能访问静态成员变量，加静态
	private static Dog d = new Dog();

	// 构造方法私有，保证外界无法直接实例化
	private Dog() {
	}

	// public：提供公共的访问方式
	// static：为了保证外界能够直接使用该方法，加静态
	public static Dog getDog() {
		return d;
	}
}
