package headfirst.designpatterns.iterator.servicemergerwheelchair;

public interface Iterator {
	boolean hasNext();
	WheelchairServices next();
}