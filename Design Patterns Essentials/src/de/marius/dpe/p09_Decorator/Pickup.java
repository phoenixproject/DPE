package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public class Pickup extends AbstractVan {

	public Pickup(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	public Pickup(Engine engine, Colour colour) {
		super(engine, colour);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 9000;
	}

}
