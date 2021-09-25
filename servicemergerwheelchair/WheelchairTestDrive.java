package headfirst.designpatterns.iterator.servicemergerwheelchair;

public class WheelchairTestDrive {

	public static void main(String args[]) {
		ElectricWheelchair electricWheelchair = new ElectricWheelchair();
		ShiftWheelchair shiftWheelchair = new ShiftWheelchair();
		Operator operator = new Operator(electricWheelchair, shiftWheelchair);
		// Use implicit iteration
		operator.printMenu();
	}
}
