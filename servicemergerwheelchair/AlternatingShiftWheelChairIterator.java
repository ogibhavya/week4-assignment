package headfirst.designpatterns.iterator.servicemergerwheelchair;

import java.util.Calendar;

public class AlternatingShiftWheelChairIterator implements Iterator {

	WheelchairServices[] list;
	int position;

	public AlternatingShiftWheelChairIterator(WheelchairServices[] list) {
		this.list = list;
		position = Calendar.DAY_OF_WEEK % 2;
	}

	public WheelchairServices next() {
		WheelchairServices wheelchairServices = list[position];
		position = position + 2;
		return wheelchairServices;
	}
	
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Diner Menu Iterator";
	}
}