package de.marius.dpe.p02_Builder;

import de.marius.dpe.resources.vehicle.AbstractCar;
import de.marius.dpe.resources.vehicle.Vehicle;


public class CarBuilder extends VehicleBuilder {

	AbstractCar carInProgress;

	public CarBuilder(AbstractCar car) {
		this.carInProgress = car;
	}

	@Override
	public void buildBody() {
		System.out.println("building car body");
	}

	@Override
	public void buildBoot() {
		System.out.println("building car boot");
	}

	@Override
	public void buildChassis() {
		System.out.println("building car chassis");
	}

	@Override
	public void buildPassengerArea() {
		System.out.println("building car passenger area");
	}

	@Override
	public void buildWindows() {
		System.out.println("building car windows");
	}

	@Override
	public Vehicle getVehicle() {
		return carInProgress;
	}
}
