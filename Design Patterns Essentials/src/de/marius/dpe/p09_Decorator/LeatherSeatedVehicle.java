package de.marius.dpe.p09_Decorator;

public class LeatherSeatedVehicle extends AbstractVehicleOption {

	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1200;
	}

}
