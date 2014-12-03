package de.marius.dpe.p05_Singleton;

public class SerialNumberGenerator {

	private int count;
	private static SerialNumberGenerator INSTANCE;

	private SerialNumberGenerator() {

	}

	public static SerialNumberGenerator getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SerialNumberGenerator();
		}
		return INSTANCE;
	}

	public int getNextSerial() {
		return ++count;
	}

}
