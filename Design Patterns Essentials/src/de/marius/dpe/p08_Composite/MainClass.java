package de.marius.dpe.p08_Composite;

public class MainClass {

	public static void main(String[] args) {

		Item nut = new Part("Nut", 5);
		Item bolt = new Part("Bolt", 9);
		Item panel = new Part("Panel", 35);

		Item gizmo = new Assembly("Gizmo");
		gizmo.addItem(nut);
		gizmo.addItem(bolt);
		gizmo.addItem(panel);

		Item widget = new Assembly("Widget");
		widget.addItem(gizmo);
		widget.addItem(nut);

		System.out.println(nut);
		System.out.println(bolt);
		System.out.println(panel);

		System.out.println(gizmo);

		System.out.println(widget);

	}

}
