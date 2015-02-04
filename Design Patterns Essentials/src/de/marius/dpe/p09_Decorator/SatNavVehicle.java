package de.marius.dpe.p09_Decorator;

public class SatNavVehicle extends AbstractVehicleOption {

	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1500;
	}

	public void setDestination() {
		// code to set destination
	}

}
