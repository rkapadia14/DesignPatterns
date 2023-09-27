package factoryPatternDemoPackage;

public class TransportationFactory {
	public Transportation getTransportationType(String transportationType) {
		if (transportationType == null) {
			return null;
		}
		if (transportationType.equalsIgnoreCase("ROAD")) {
			return new RoadTransportation();

		} else if (transportationType.equalsIgnoreCase("SHIP")) {
			return new ShipTransportation();

		}
		return null;
	}

}
