package de.marius.dpe.p09_Decorator;

public class MetallicPaintedVehicle extends AbstractVehicleOption {

	public MetallicPaintedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 750;
	}

}
