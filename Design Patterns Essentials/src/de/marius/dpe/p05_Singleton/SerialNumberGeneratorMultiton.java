package de.marius.dpe.p05_Singleton;

/**
 * A singleton that can generate two distinct sequences of serial numbers, a.k.a a multiton.
 * 
 * @author Marius
 *
 */
public enum SerialNumberGeneratorMultiton {

	ENGINE, VEHICLE;

	private int count;

	public int getNextSerial() {
		return ++count;
	}

}
