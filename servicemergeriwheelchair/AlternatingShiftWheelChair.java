package headfirst.designpatterns.iterator.servicemergeriwheelchair;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingShiftWheelChair implements Iterator<Object>{

		WheelchairServices[] services;
		int position;

		public AlternatingShiftWheelChair(WheelchairServices[] services) {
			this.services = services;
			position = Calendar.DAY_OF_WEEK % 2;
		}
		public Object next() {
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
				"Alternating Diner Menu Iterator does not support remove()");
		}
	}
