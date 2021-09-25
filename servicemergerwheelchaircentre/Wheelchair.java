package headfirst.designpatterns.iterator.servicemergerwheelchaircentre;

import java.util.Iterator;

public interface Wheelchair {
	public Iterator<WheelchairServices> createIterator();
}