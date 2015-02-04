package de.marius.dpe.p08_Composite;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends Item {

	List<Item> items;

	public Assembly(String description) {
		super(description, 0);
		this.items = new ArrayList<Item>(0);
	}

	@Override
	public int getCost() {
		int totalCost = 0;
		for (Item item : items) {
			totalCost += item.getCost();
		}
		return totalCost;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public Item[] getItems() {
		return this.items.toArray(new Item[this.items.size()]);
	}

}
