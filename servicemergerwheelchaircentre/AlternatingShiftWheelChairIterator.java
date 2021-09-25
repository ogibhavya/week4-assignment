package headfirst.designpatterns.iterator.servicemergerwheelchaircentre;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingShiftWheelChairIterator implements Iterator<WheelchairServices> {

	WheelchairServices[] services;
	int position;

	public AlternatingShiftWheelChairIterator(WheelchairServices[] services) {
		this.services = services;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	
	public WheelchairServices next() {
		WheelchairServices wheelchairServices = services[position];
		position = position + 2;
		return wheelchairServices;
	}
	
	public boolean hasNext() {
		if (position >= services.length || services[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public void remove() {
		throw new UnsupportedOperationException(
			"Alternating Shiftwheelchair Iterator does not support remove()");
	}
}