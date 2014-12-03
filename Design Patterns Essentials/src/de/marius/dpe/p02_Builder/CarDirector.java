package de.marius.dpe.p02_Builder;

import de.marius.dpe.resources.vehicle.Vehicle;

public class CarDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {

		builder.buildBody();
		builder.buildBoot();
		builder.buildChassis();
		builder.buildPassengerArea();
		builder.buildWindows();

		return builder.getVehicle();
	}

}
