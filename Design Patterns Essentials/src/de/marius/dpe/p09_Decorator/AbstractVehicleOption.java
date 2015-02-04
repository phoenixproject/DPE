package de.marius.dpe.p09_Decorator;

public abstract class AbstractVehicleOption extends AbstractVehicle {

	Vehicle decoratedVehicle;

	public AbstractVehicleOption(Vehicle vehicle) {
		super(vehicle.getEngine());
		this.decoratedVehicle = vehicle;
	}


}
