package headfirst.designpatterns.iterator.implicitwheelchair;

import java.util.Iterator;

public interface Wheelchair {
	public Iterator<WheelchairServices> createIterator();
}