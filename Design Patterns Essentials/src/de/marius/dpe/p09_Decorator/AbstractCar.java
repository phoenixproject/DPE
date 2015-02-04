package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	public AbstractCar(Engine engine, Colour colour) {
		super(engine, colour);
	}

}
