package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public class Saloon extends AbstractCar {

	public Saloon(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public Saloon(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 6000;
	}

}
