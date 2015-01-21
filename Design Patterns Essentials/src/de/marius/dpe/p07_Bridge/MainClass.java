package de.marius.dpe.p07_Bridge;

public class MainClass {

	public static void main(String[] args) {
		Engine engine = new StandardEngine(1400);

		StandardControls driverControls1 = new StandardControls(engine);
		driverControls1.ignitionOn();
		driverControls1.accelerate();
		driverControls1.brake();
		driverControls1.ignitionOff();

		SportControls driverControls2 = new SportControls(engine);
		driverControls2.ignitionOn();
		driverControls2.accelerate();
		driverControls2.accelerateHard();
		driverControls2.brake();
		driverControls2.ignitionOff();

	}

}
