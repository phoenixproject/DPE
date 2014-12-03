package de.marius.dpe.resources.engine;

public class AbstractEngine implements Engine {
	int size;
	boolean turbo;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
	}

	public int getSize() {
		return this.size;
	}

	public boolean isTurbo() {
		return this.turbo;
	}

	public String toString() {
		return getClass().getSimpleName() + "(" + size + ")";
	}
}
