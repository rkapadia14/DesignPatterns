package factoryPatternDemoPackage;

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransportationFactory tf = new TransportationFactory();
		Transportation t1 = tf.getTransportationType("ROAD");
		t1.transportGoods();
		
		Transportation t2 = tf.getTransportationType("SHIP");
		t2.transportGoods();
	}

}
