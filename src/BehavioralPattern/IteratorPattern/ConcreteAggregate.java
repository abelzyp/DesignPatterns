package BehavioralPattern.IteratorPattern;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {
	private Vector<Object> vector = new Vector<Object>();

	@Override
	public void add(Object obj) {
		this.vector.add(obj);
	}

	@Override
	public Iterator creatIterator() {
		return new ConcreteIterator(this);
	}

	public Object getElement(int index) {
		if (index < vector.size()) {
			return vector.get(index);
		} else {
			return null;
		}
	}

	public int size() {
		return vector.size();
	}
}
