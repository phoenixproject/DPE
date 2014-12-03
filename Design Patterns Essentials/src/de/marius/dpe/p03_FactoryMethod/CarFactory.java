package de.marius.dpe.p03_FactoryMethod;
import de.marius.dpe.resources.engine.StandardEngine;
import de.marius.dpe.resources.engine.TurboEngine;
import de.marius.dpe.resources.vehicle.AbstractVehicle;
import de.marius.dpe.resources.vehicle.Coupe;
import de.marius.dpe.resources.vehicle.Saloon;
import de.marius.dpe.resources.vehicle.Sport;

public class CarFactory extends VehicleFactory {

	@Override
	protected AbstractVehicle selectVehicle(DrivingStyle style) {
		AbstractVehicle v = null;
		switch (style) {
		case ECONOMICAL:
			v = new Saloon(new StandardEngine(1300));
			break;

		case MIDRANGE: {
			v = new Coupe(new StandardEngine(1900));
			break;
		}

		case POWERFUL: {
			v = new Sport(new TurboEngine(2200));
			break;
		}
		}
		return v;
	}

}
