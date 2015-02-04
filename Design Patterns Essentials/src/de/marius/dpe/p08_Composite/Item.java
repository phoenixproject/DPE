package de.marius.dpe.p08_Composite;

public abstract class Item {

	int cost;
	String description;

	public Item(String description, int cost) {
		this.description = description;
		this.cost = cost;
	}

	public String getDescription() {
		return this.description;
	}

	public int getCost() {
		return this.cost;
	}

	public abstract void addItem(Item item);

	public abstract void removeItem(Item item);

	public abstract Item[] getItems();

	@Override
	public String toString() {
		return description + "(cost " + getCost() + ")";
	}

}
