package builderDemoPackage;

//The class for which the complex object needs to be created with builder pattern 
public class Computer {

	//data members
	private String RAM;
	private String HDD;
	private String CPU;
	
	//optional parameters for creating an advanced computer
	private boolean isGraphicsCardEnabled;
	private boolean isWiFiEnabled;
	
	//private constructor to restrict creation of object
	private Computer(ComputerBuilderDemo builder) {
		this.HDD = builder.HDD;
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.isWiFiEnabled = builder.isWiFiEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}
	
	//Only getter methods, no setter methods to restrict setting of variables with setter methods
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public String getCPU() {
		return CPU;
	}
	
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isWiFiEnabled() {
		return isWiFiEnabled;
	}

	//nested inner static class to copy all the properties of the main class object to be returned.
	public static class ComputerBuilderDemo{
		//required parameters
		private String RAM;
		private String HDD;
		private String CPU;
		
		private boolean isGraphicsCardEnabled;
		private boolean isWiFiEnabled;
		
		
		//public constructor with the necessary parameters
		public ComputerBuilderDemo(String ram, String hdd, String cpu) {
			this.RAM = ram;
			this.HDD = hdd;
			this.CPU = cpu;
		}
		
		public ComputerBuilderDemo setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilderDemo setWiFiEnabled(boolean isWiFiEnabled) {
			this.isWiFiEnabled = isWiFiEnabled;
			return this;
		}
		//builder method that returns the final complex object
		public Computer build() {
			return new Computer(this);
		}
	}

}