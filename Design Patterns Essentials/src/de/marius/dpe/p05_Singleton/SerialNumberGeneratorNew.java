package de.marius.dpe.p05_Singleton;

public enum SerialNumberGeneratorNew {
	INSTANCE;

	private int count;

	public int getNextSerial() {
		return ++count;
	}
}
