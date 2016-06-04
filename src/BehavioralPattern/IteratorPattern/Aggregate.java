package BehavioralPattern.IteratorPattern;

/*
 * 抽象聚集角色
 */
public interface Aggregate {
	public void add(Object obj);

	public Iterator creatIterator();
}
