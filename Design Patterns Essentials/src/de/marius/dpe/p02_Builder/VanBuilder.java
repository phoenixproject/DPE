package de.marius.dpe.p02_Builder;

import de.marius.dpe.resources.vehicle.AbstractVan;

public class VanBuilder extends VehicleBuilder {

	AbstractVan vanInProgress;

	public VanBuilder(AbstractVan van) {
		this.vanInProgress = van;
	}

	public void buildBody() {
		System.out.println("building van body");
	}

	public void buildChassis() {
		System.out.println("building van chassis");
	}

	public void buildReinforcedStorageArea() {
		System.out.println("building van storage area");
	}

	public void buildWindows() {
		System.out.println("building van windows");
	}

	public AbstractVan getVehicle() {
		return vanInProgress;
	}

}
