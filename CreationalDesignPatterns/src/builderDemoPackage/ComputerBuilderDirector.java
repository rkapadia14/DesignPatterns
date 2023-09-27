package builderDemoPackage;

public class ComputerBuilderDirector {
		
	public static void main(String[] args)
	{
		
		Computer comp1 = new ComputerBuilderDriver().getBasicComputer();
		System.out.println("Built Basic Computer Built with the following configurations: 1. "+comp1.getCPU()+ ",2. RAM:"+comp1.getRAM()+ ",3. HDD:"+comp1.getHDD());
	
		Computer comp2 = new ComputerBuilderDriver().getAdvancedComputer();
		System.out.println("Built Advanced Computer Built with the following configurations: 1. "+comp2.getCPU()+ ", 2. RAM:"+comp2.getRAM()+ ", 3. HDD:"+comp2.getHDD() +", 4. WiFi enabled:" + comp2.isWiFiEnabled() + ", 5. Graphics enabled:" + comp2.isGraphicsCardEnabled());
	}

}
