package de.marius.dpe.p02_Builder;

import de.marius.dpe.resources.vehicle.Vehicle;


public class VanDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {
		builder.buildChassis();
		builder.buildBody();
		builder.buildReinforcedStorageArea();
		builder.buildWindows();

		return builder.getVehicle();
	}

}
