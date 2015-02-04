package de.marius.dpe.p09_Decorator;

public class AlloyWheeledVehicle extends AbstractVehicleOption {

	public AlloyWheeledVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 250;
	}

}
