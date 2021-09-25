package headfirst.designpatterns.iterator.servicemergeriwheelchair;

import java.util.Iterator;

public interface Wheelchair {
	public Iterator<WheelchairServices> createIterator();
}