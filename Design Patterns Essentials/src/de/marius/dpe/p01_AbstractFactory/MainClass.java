package de.marius.dpe.p01_AbstractFactory;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		String carType = "car";

		System.out.println("What vehicle type do you want? Type \"car\" or \"van\"");
		Scanner inputReader = new Scanner(System.in);

		carType = inputReader.next();
		inputReader.close();
		
		AbstractVehicleFactory aVehicleFactory = null;
		if (carType.equals("car")) {
			aVehicleFactory = new CarFactory();
		} else {
			aVehicleFactory = new VanFactory();
		}
		Body body = aVehicleFactory.createBody();
		Chassis chassis = aVehicleFactory.createChassis();
		Windows windows = aVehicleFactory.createWindows();

		System.out.println(body.getBodyParts());
		System.out.println(chassis.getChassisParts());
		System.out.println(windows.getWindowsParts());

	}
}
