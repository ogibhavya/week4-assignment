package headfirst.designpatterns.iterator.servicemergerwheelchair;

import java.util.Iterator;

public interface Wheelchair {
	public Iterator<WheelchairServices> createIterator();
}