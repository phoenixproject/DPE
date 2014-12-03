package de.marius.dpe.p04_Prototype;

import de.marius.dpe.resources.engine.StandardEngine;
import de.marius.dpe.resources.engine.TurboEngine;
import de.marius.dpe.resources.vehicle.BoxVan;
import de.marius.dpe.resources.vehicle.Coupe;
import de.marius.dpe.resources.vehicle.Pickup;
import de.marius.dpe.resources.vehicle.Saloon;
import de.marius.dpe.resources.vehicle.Sport;
import de.marius.dpe.resources.vehicle.Vehicle;

public class VehicleManager {

	private Vehicle saloon, coupe, sport, boxVan, pickup;

	public VehicleManager() {

	}

	public Vehicle createSaloon() {
		if (saloon == null) {
			saloon = new Saloon(new StandardEngine(1300));
			return saloon;
		}
		return (Vehicle) saloon.clone();
	}

	public Vehicle createCoupe() {
		if (coupe == null) {
			coupe = new Coupe(new StandardEngine(1300));
			return coupe;
		}
		return (Vehicle) coupe.clone();
	}

	public Vehicle createSport() {
		if (sport == null) {
			sport = new Sport(new TurboEngine(1999));
			return sport;
		}
		return (Vehicle) sport.clone();
	}

	public Vehicle createBoxVan() {
		if (boxVan == null) {
			boxVan = new BoxVan(new StandardEngine(1600));
			return boxVan;
		}
		return (Vehicle) boxVan.clone();
	}

	public Vehicle createPickup() {
		if (pickup == null) {
			pickup = new Pickup(new TurboEngine(2300));
		}
		return pickup;
	}

}
