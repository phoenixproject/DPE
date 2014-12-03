package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;


public class AbstractVan extends AbstractVehicle{
	
	public AbstractVan(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public AbstractVan(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}
}
