package de.marius.dpe.p02_Builder;

import de.marius.dpe.resources.vehicle.Vehicle;

public abstract class VehicleDirector {

	public abstract Vehicle build(VehicleBuilder builder);
}
