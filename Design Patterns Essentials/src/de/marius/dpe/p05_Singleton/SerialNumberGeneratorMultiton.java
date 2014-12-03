package de.marius.dpe.p05_Singleton;

public enum SerialNumberGeneratorMultiton {

	ENGINE, VEHICLE;

	private int count;

	public int getNextSerial() {
		return ++count;
	}

}
