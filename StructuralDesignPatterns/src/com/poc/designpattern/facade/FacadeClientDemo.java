package com.poc.designpattern.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeClientDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.print("========= Mobile Shop ============ \n");
		System.out.print("1. IPHONE.              \n");
		System.out.print("2. SAMSUNG.              \n");
		System.out.print("3. OnePlus.                 \n");
		System.out.print("4. Exit.                   \n");
		System.out.print("Enter your choice: ");
		int choice;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			MobileShop mobileShop = new MobileShop();

			switch (choice) {
			case 1: {
				mobileShop.iPhoneDetails();
			}
				break;
			case 2: {
				mobileShop.samsungDetails();
			}
				break;
			case 3: {
				mobileShop.onePlusDetails();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}
		} while (choice != 4);

	}

}
