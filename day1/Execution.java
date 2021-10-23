package week3.day1;

public class Execution {

	public static void main(String[] args) {

		BMW b = new BMW();

		b.accelerate();
		b.applyBrake();
		b.closeDoor();
		b.enableAirbag();
		b.fillFuel();
		b.shiftGear();
		b.driveVehicle();


		Audi a = new Audi();

		a.accelerate();
		a.applyBrake();
		a.closeDoor();
		a.enableAirbag();
		a.fillFuel();
		a.shiftGear();
		a.driveVehicle();
		
		Car c = new Car();
		c.accelerate();
		c.applyBrake();
		c.closeDoor();
		c.driveVehicle();
		c.enableAirbag();
		c.fillFuel();
		c.shiftGear();


		{
			System.out.println("Number of Wheels in Car: " + c.wheelCar);
		}


		Bajaj b1 = new Bajaj();

		b1.accelerate();
		b1.applyBrake();
		b1.driveVehicle();
		b1.fillFuel();
		b1.shiftGear();

		Mahindra m = new Mahindra();

		m.accelerate();
		m.applyBrake();
		m.driveVehicle();
		m.fillFuel();
		m.shiftGear();

		Auto a1 = new Auto();

		a1.accelerate();
		a1.applyBrake();
		a1.driveVehicle();
		a1.fillFuel();
		a1.shiftGear();
		{
			System.out.println("Number of Wheels in Auto: " + a1.wheelAuto);
		}
	}

}
