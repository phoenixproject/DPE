package de.marius.dpe.p07_Bridge;

public class AbstractDriverControls {

	private Engine engine;

	public AbstractDriverControls(Engine engine) {
		this.engine = engine;
	}

	public void ignitionOn() {
		this.engine.start();
	}

	public void ignitionOff() {
		this.engine.stop();
	}

	public void accelerate() {
		this.engine.increasePower();
	}

	public void brake() {
		this.engine.decreasePower();
	}

}
