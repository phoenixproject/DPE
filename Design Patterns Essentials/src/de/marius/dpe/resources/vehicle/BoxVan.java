package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class BoxVan extends AbstractVan {

	public BoxVan(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public BoxVan(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

}
