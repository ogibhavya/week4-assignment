package headfirst.designpatterns.iterator.servicemergeriwheelchair;

import java.util.ArrayList;
import java.util.Iterator;

public class ElectricWheelchair implements Wheelchair {
	ArrayList<WheelchairServices> wheelchairServices;
 
	public ElectricWheelchair() {
		wheelchairServices = new ArrayList<WheelchairServices>();
	}

	public void addService(String name, String description,
	                    boolean outpatient, double price)
	{
		WheelchairServices wheelchairServices = new WheelchairServices(name, description, outpatient, price);
		wheelchairServices.add(wheelchairServices);
	}
 
	public ArrayList<WheelchairServices> getWheelchairService() {
		return wheelchairServices;
	}
  
	public Iterator<WheelchairServices> createIterator() {
		return wheelchairServices.iterator();
	}
  
	// other menu methods here
}