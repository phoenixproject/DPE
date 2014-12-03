package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class Coupe extends AbstractCar {

	public Coupe(Engine engine, Colour colour) {
		super(engine, colour);
	}
	
	public Coupe(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

}
