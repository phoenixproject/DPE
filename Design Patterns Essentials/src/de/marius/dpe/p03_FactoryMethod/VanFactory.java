package de.marius.dpe.p03_FactoryMethod;

import de.marius.dpe.resources.engine.StandardEngine;
import de.marius.dpe.resources.engine.TurboEngine;
import de.marius.dpe.resources.vehicle.AbstractVehicle;
import de.marius.dpe.resources.vehicle.BoxVan;
import de.marius.dpe.resources.vehicle.Pickup;

public class VanFactory extends VehicleFactory {

	@Override
	protected AbstractVehicle selectVehicle(DrivingStyle style) {
		AbstractVehicle v = null;

		switch (style) {
		case MIDRANGE:
		case ECONOMICAL: {
			v = new BoxVan(new StandardEngine(1500));
			break;
		}
		case POWERFUL: {
			v = new Pickup(new TurboEngine(2300));
			break;
		}
		}
		return v;
	}

}
