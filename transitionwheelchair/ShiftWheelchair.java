package headfirst.designpatterns.iterator.transitionwheelchair;

import java.util.Iterator;

public class ShiftWheelchair implements Wheelchair {

static final int MAX_Services = 5;
int numberOfServices = 0;
WheelchairServices[] wheelchairServices;

public ShiftWheelchair() {
	wheelchairServices = new WheelchairServices[MAX_Services];

	addService("Racing",
			"Wheel Chair - Racing - transition Wheel Chair", true, 2.99);
		addService("Offroad",
			"Wheel Chair - Offroad - transition Wheel Chair", false, 2.99);
		addService("Medical",
			"Wheel Chair - Medical - transition Wheel Chair", false, 3.29);
		addService("Daily",
			"Wheel Chair - Daily - transition Wheel Chair", false, 3.29);
		addService("Electric",
			"Wheel Chair - Electric - transition Wheel Chair", false, 3.29);
	}

public void addService(String name, String description, 
                     boolean outpatient, double price) 
{
	WheelchairServices wheelchairServices = new WheelchairServices(name, description, outpatient, price);
	if (numberOfServices >= MAX_Services) {
		System.err.println("Sorry, menu is full!  Can't add item to menu");
	} else {
		getWheelchairServices()[numberOfServices] = wheelchairServices;
		numberOfServices = numberOfServices + 1;
	}
}

public WheelchairServices[] getWheelchairServices() {
	return wheelchairServices;
}

public Iterator<WheelchairServices> createIterator() {
	return new ShiftWheelchairIterator(wheelchairServices);
	//return new AlternatingDinerMenuIterator(menuItems);
}

// other menu methods here
}