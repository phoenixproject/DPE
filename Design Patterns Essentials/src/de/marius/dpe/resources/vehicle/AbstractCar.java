package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	public AbstractCar(Engine engine, Colour colour) {
		super(engine, colour);
	}

}
