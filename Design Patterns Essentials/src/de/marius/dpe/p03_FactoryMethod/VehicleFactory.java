package de.marius.dpe.p03_FactoryMethod;
import de.marius.dpe.resources.vehicle.AbstractVehicle;
import de.marius.dpe.resources.vehicle.Vehicle;
import de.marius.dpe.resources.vehicle.Vehicle.Colour;

public abstract class VehicleFactory {

	public enum DrivingStyle {
		ECONOMICAL, MIDRANGE, POWERFUL
	}

	protected abstract AbstractVehicle selectVehicle(DrivingStyle style);

	public Vehicle build(DrivingStyle style, Colour colour) {
		Vehicle ve = selectVehicle(style);
		ve.paint(colour);
		return ve;
	}
}
