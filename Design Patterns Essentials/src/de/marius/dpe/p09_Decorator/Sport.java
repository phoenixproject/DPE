package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public class Sport extends AbstractCar{

	public Sport(Engine engine, Colour colour){
		super(engine, colour);
	}
	
	public Sport(Engine engine) {
		super(engine, Colour.UNPAINTED);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 8000;
	}
}
