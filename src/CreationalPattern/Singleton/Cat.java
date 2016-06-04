package CreationalPattern.Singleton;

/*
 * 懒汉式：第一次引用类时，才进行对象实例化。
 */
public class Cat {
	private static Cat cat = null;

	private Cat() {
	}

	// 由于会出现线程安全问题，加synchronized
	public synchronized static Cat getCat() {
		if (cat == null) {
			cat = new Cat();
		}
		return cat;
	}
}
