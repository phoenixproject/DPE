package de.marius.dpe.p07_Bridge;

public class SportControls extends AbstractDriverControls {

	public SportControls(Engine engine) {
		super(engine);
	}

	public void accelerateHard() {
		accelerate();
		accelerate();
	}

}
