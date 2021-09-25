package headfirst.designpatterns.iterator.transitionwheelchair;

import java.util.Iterator;

public interface Wheelchair {
	public Iterator<?> createIterator();
}