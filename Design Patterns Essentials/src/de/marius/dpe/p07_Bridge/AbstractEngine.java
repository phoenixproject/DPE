package de.marius.dpe.p07_Bridge;

public class AbstractEngine implements Engine {
	int size;
	boolean turbo;

	boolean running;
	int power;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;

		this.power = 0;
		this.running = false;

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

	@Override
	public void start() {
		this.running = true;
		System.out.println("Engine started!");

	}

	@Override
	public void stop() {
		this.running = false;
		System.out.println("Engine stopped!");
	}

	@Override
	public void increasePower() {
		if (running && (power < 10)) {
			power++;
			System.out.println("Engine power increased to " + this.power);
		}

	}

	@Override
	public void decreasePower() {
		if (running && (power > 0)) {
			power--;
			System.out.println("Engine power decreased to " + this.power);
		}

	}
}
