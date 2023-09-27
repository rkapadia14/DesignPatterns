package com.poc.designpattern.facade;

public class Samsung implements IMobileShop {

	@Override
	public void getMobileModelNumber() {
		System.out.println("This is Samsung Z Flip");

	}

	@Override
	public void getMobilePrice() {
		System.out.println("The price for Samsung Z Flip is: $1299");

	}

}
