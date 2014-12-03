package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public class AbstractVehicle implements Vehicle {
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
		return getClass().getSimpleName() + "(" + this.getEngine() + ", " + this.getColour() + ")";
	}

}
