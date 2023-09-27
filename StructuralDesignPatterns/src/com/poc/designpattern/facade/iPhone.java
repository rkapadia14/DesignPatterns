package com.poc.designpattern.facade;

public class iPhone implements IMobileShop{

	@Override
	public void getMobileModelNumber() {
		System.out.println("This is iPhone 14 Pro");
		
	}

	@Override
	public void getMobilePrice() {
		System.out.println("The price for iPhone 14 Pro is: $1099");
		
	}

}
