package de.marius.dpe.p05_Singleton;

public class MainClass {

	public static void main(String[] args) {
		// Get some serial numbers with the traditional Singleton implementation
		System.out.println("Serials from the traditional implementaion");
		SerialNumberGenerator sGen = SerialNumberGenerator.getInstance();
		System.out.println(sGen.getNextSerial());
		System.out.println(sGen.getNextSerial());
		System.out.println(sGen.getNextSerial());

		// Get some serials with the new implementation, available since Java 1.5
		System.out.println("Serials from the Enum-based implementation");
		System.out.println(SerialNumberGeneratorNew.INSTANCE.getNextSerial());
		System.out.println(SerialNumberGeneratorNew.INSTANCE.getNextSerial());
		System.out.println(SerialNumberGeneratorNew.INSTANCE.getNextSerial());

		// Get some serials from the "Multiton" implementation
		System.out.println("Serials from the multiton \"Enum-based\" implementation");
		System.out.println("Engine serials:");
		System.out.println(SerialNumberGeneratorMultiton.ENGINE.getNextSerial());
		System.out.println(SerialNumberGeneratorMultiton.ENGINE.getNextSerial());
		System.out.println(SerialNumberGeneratorMultiton.ENGINE.getNextSerial());
		System.out.println("Vehicle serials:");
		System.out.println(SerialNumberGeneratorMultiton.VEHICLE.getNextSerial());
		System.out.println(SerialNumberGeneratorMultiton.VEHICLE.getNextSerial());
		System.out.println(SerialNumberGeneratorMultiton.VEHICLE.getNextSerial());

	}

}
