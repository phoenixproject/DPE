package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public class BoxVan extends AbstractVan {

	public BoxVan(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public BoxVan(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
