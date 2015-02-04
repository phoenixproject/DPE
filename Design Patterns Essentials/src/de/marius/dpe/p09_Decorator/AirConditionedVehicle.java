package de.marius.dpe.p09_Decorator;

public class AirConditionedVehicle extends AbstractVehicleOption {

	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 600;
	}

	public void setTemperatur() {
		// set temp code
	}

}
