package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;


public abstract class AbstractVan extends AbstractVehicle {
	
	public AbstractVan(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public AbstractVan(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}
}
