package headfirst.designpatterns.iterator.transitionwheelchair;

import java.util.*;
 
public class Operator {
	ArrayList<Wheelchair> wheelchairs;
 
	public Operator(ArrayList<Wheelchair> wheelchairs) {
		this.wheelchairs = wheelchairs;
	}

	public void printMenu() {
		Iterator<?> wheelchairIterator = wheelchairs.iterator();
		while(wheelchairIterator.hasNext()) {
			Wheelchair wheelchair = (Wheelchair)wheelchairIterator.next();
			printWheelchair(wheelchair.createIterator());
		}
	}
			
	void printWheelchair(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			WheelchairServices wheelchairServices = (WheelchairServices)iterator.next();
		System.out.print(wheelchairServices.getName() + ", ");
		System.out.print(wheelchairServices.getPrice() + " -- ");
		System.out.println(wheelchairServices.getDescription());
	}
}
}