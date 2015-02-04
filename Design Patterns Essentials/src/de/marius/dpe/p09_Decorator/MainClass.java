package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.StandardEngine;

public class MainClass {

	public static void main(String[] args) {

		Vehicle myCar = new Saloon(new StandardEngine(1300));
		System.out.println(myCar);

		// Add air conditioning
		myCar = new AirConditionedVehicle(myCar);
		System.out.println(myCar);

		// Add alloy wheels
		myCar = new AlloyWheeledVehicle(myCar);
		System.out.println(myCar);

		// Add leather seats
		myCar = new LeatherSeatedVehicle(myCar);
		System.out.println(myCar);

		// Add metallic paint
		myCar = new MetallicPaintedVehicle(myCar);
		System.out.println(myCar);

		// Add satellite-navigation
		myCar = new SatNavVehicle(myCar);
		System.out.println(myCar);

	}

}
