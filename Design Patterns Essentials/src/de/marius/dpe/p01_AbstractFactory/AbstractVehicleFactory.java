package de.marius.dpe.p01_AbstractFactory;

public abstract class AbstractVehicleFactory {

	public abstract Body createBody();

	public abstract Chassis createChassis();

	public abstract Windows createWindows();

}
