package de.marius.dpe.p06_Adapter;

import de.marius.dpe.resources.engine.AbstractEngine;

public class SuperGreenEngineAdapter extends AbstractEngine {
	public SuperGreenEngineAdapter(SuperGreenEngine superGreenEngine) {
		super(superGreenEngine.getEngineSize(), false);
	}
}
