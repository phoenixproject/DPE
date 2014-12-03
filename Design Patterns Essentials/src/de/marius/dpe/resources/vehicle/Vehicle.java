package de.marius.dpe.resources.vehicle;

import de.marius.dpe.resources.engine.Engine;

public interface Vehicle extends Cloneable {

	public enum Colour {
		UNPAINTED, BLACK, BLUE, SILVER, WHITE, YELLOW, RED, GREEn
	}

	public Engine getEngine();

	public Colour getColour();

	public void paint(Colour colour);

	public Object clone();

}
