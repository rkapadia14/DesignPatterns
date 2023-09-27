package com.poc.designpattern.facade;

public class MobileShop {
	private IMobileShop iPhone;
	private IMobileShop samsung;
	private IMobileShop onePlus;
	
	public MobileShop() {
		super();
		this.iPhone = new iPhone();
		this.samsung = new Samsung();
		this.onePlus = new OnePlus();
	}
	
	public void iPhoneDetails()
	{
		iPhone.getMobileModelNumber();
		iPhone.getMobilePrice();
	}
	
	public void samsungDetails()
	{
		samsung.getMobileModelNumber();
		samsung.getMobilePrice();
	}
	
	public void onePlusDetails()
	{
		onePlus.getMobileModelNumber();
		onePlus.getMobilePrice();
	}
	
}
