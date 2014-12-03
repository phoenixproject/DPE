package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class Saloon extends AbstractCar {

	public Saloon(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public Saloon(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

}
