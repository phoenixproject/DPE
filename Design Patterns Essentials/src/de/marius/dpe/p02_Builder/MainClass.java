package de.marius.dpe.p02_Builder;

import de.marius.dpe.resources.engine.StandardEngine;
import de.marius.dpe.resources.vehicle.AbstractCar;
import de.marius.dpe.resources.vehicle.Saloon;
import de.marius.dpe.resources.vehicle.Vehicle;
import de.marius.dpe.resources.vehicle.Vehicle.Colour;


public class MainClass {

	public static void main(String[] args) {

		AbstractCar car = new Saloon(new StandardEngine(1300), Colour.BLUE);
		VehicleBuilder vBuilder = new CarBuilder(car);
		VehicleDirector vDir = new CarDirector();
		Vehicle v = vDir.build(vBuilder);

		System.out.println(v);

	}

}
