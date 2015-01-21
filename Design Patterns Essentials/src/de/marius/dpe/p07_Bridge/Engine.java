package de.marius.dpe.p07_Bridge;

public interface Engine {

	public int getSize();
	public boolean isTurbo();

	public void start();

	public void stop();

	public void increasePower();

	public void decreasePower();
}
