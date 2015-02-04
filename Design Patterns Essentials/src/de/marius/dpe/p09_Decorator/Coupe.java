package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public class Coupe extends AbstractCar {

	public Coupe(Engine engine, Colour colour) {
		super(engine, colour);
	}
	
	public Coupe(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 7000;
	}

}
