package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class Sport extends AbstractCar{

	public Sport(Engine engine, Colour colour){
		super(engine, colour);
	}
	
	public Sport(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}
}
