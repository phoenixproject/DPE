package de.marius.dpe.p06_Adapter;

public class SuperGreenEngine {

	int engineSize;

	public SuperGreenEngine(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public String toString() {
		return "SUPER ENGINE " + engineSize;
	}

}
