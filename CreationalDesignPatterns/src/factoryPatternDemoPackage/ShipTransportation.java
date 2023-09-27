package factoryPatternDemoPackage;

public class ShipTransportation implements Transportation{

	@Override
	public void transportGoods() {
		System.out.println("Transporting goods via ship");
		
	}
}
