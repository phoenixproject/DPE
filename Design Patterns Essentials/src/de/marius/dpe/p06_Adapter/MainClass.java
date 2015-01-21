package de.marius.dpe.p06_Adapter;

import java.util.ArrayList;
import java.util.List;

import de.marius.dpe.resources.engine.Engine;
import de.marius.dpe.resources.engine.StandardEngine;
import de.marius.dpe.resources.engine.TurboEngine;

public class MainClass {

	public static void main(String[] args) {
		List<Engine> engines = new ArrayList<>();
		engines.add(new StandardEngine(1300));
		engines.add(new StandardEngine(1500));
		engines.add(new TurboEngine(1800));
		engines.add(new TurboEngine(2100));

		engines.add(new SuperGreenEngineAdapter(new SuperGreenEngine(1100)));

		for (Engine engine : engines) {
			System.out.println(engine);
		}

	}

}
