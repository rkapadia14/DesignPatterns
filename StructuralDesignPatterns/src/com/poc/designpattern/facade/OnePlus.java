package com.poc.designpattern.facade;

public class OnePlus implements IMobileShop {

	@Override
	public void getMobileModelNumber() {
		System.out.println("This is One Plus 8");

	}

	@Override
	public void getMobilePrice() {
		System.out.println("The price for One Plus 8 is: $899");

	}

}
