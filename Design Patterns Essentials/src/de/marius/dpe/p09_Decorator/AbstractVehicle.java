package de.marius.dpe.p09_Decorator;

import de.marius.dpe.resources.engine.Engine;

public abstract class AbstractVehicle implements Vehicle {
	Engine engine;
	Colour colour;

	public AbstractVehicle(Engine engine, Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}

	public AbstractVehicle(Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Engine getEngine() {
		return this.engine;
	}

	public Colour getColour() {
		return this.colour;
	}

	public void paint(Colour colour) {
		this.colour = colour;
	}

	public abstract int getPrice();

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String toString() {
		return getClass().getSimpleName() + "( Engine " + this.getEngine() + ", Colour "
				+ this.getColour() + ", Price " + this.getPrice() + ")";
	}

}
