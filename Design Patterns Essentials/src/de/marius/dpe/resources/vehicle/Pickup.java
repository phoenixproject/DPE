package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class Pickup extends AbstractVan {

	public Pickup(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	public Pickup(Engine engine, Colour colour) {
		super(engine, colour);
	}

}
