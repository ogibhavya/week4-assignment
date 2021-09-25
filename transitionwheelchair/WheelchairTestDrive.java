package headfirst.designpatterns.iterator.transitionwheelchair;
import java.util.ArrayList;
public class WheelchairTestDrive {

	public static void main(String args[]) {
		ElectricWheelchair electricWheelchair = new ElectricWheelchair();
		ShiftWheelchair shiftWheelchair = new ShiftWheelchair();
		ArrayList<Wheelchair> wheelchairs = new ArrayList<Wheelchair>();
		wheelchairs.add(electricWheelchair);
		wheelchairs.add(shiftWheelchair);
		Operator operator = new Operator(wheelchairs);
		// Use implicit iteration
		operator.printMenu();
	}
}
