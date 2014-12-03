package de.marius.dpe.p04_Prototype;

import de.marius.dpe.resources.vehicle.Vehicle;

public class MainClass {
	public static void main(String[] args) {
		VehicleManager vMan = new VehicleManager();

		Vehicle car = vMan.createCoupe();
		Vehicle sportCar = vMan.createSport();
		Vehicle pickup = vMan.createPickup();

		System.out.println(car);
		System.out.println(sportCar);
		System.out.println(pickup);
	}
}
