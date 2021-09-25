package headfirst.designpatterns.iterator.servicemergerwheelchair;

public class WheelchairServices {

	String name;
	String description;
	boolean outpatient;
	double price;
 
	public WheelchairServices(String name, 
	                String description, 
	                boolean outpatient, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.outpatient = outpatient;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isOutpatient() {
		return outpatient;
	}

	public void add(WheelchairServices wheelchairServices) {
		// TODO Auto-generated method stub
		
	}
}