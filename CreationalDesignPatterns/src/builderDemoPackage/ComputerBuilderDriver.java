package builderDemoPackage;

public class ComputerBuilderDriver {
	
	public Computer getBasicComputer() {
		return new Computer.ComputerBuilderDemo("5GB", "1TB", "Intel i5").build();
	}

	public Computer getAdvancedComputer() {
		return new Computer.ComputerBuilderDemo("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).setWiFiEnabled(true).build();
	}
	
	
}
