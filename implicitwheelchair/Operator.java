package headfirst.designpatterns.iterator.implicitwheelchair;

import java.util.List;
 
public class Operator {
	Wheelchair electricWheelchair;
	Wheelchair shiftWheelchair;
 
	public Operator(Wheelchair electricWheelchair, Wheelchair shiftWheelchair) {
		this.electricWheelchair = electricWheelchair;
		this.shiftWheelchair = shiftWheelchair;
	}
	
	// implicit iteration
	public void printMenu() {
		List<WheelchairServices> breakfastItems = ((ElectricWheelchair) electricWheelchair).getWheelchairService();
		for (WheelchairServices m : breakfastItems) {
			printWheelchairServices(m);
		}
		
		WheelchairServices[] lunchItems = ((ShiftWheelchair) shiftWheelchair).getWheelchairServices();
		for (WheelchairServices m : lunchItems) {
			printWheelchairServices(m);
		}
	}
	
	public void printWheelchairServices(WheelchairServices wheelchairServices) {
		System.out.print(wheelchairServices.getName() + ", ");
		System.out.print(wheelchairServices.getPrice() + " -- ");
		System.out.println(wheelchairServices.getDescription());
	}
}