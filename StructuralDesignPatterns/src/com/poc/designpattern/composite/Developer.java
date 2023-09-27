package com.poc.designpattern.composite;

//Leaf class
public class Developer implements Employee {

	private String developerName;
	private String developerEmpId;
	private String empDesignation;

	
	public Developer(String developerName, String developerEmpId, String empDesignation) {
		super();
		this.developerName = developerName;
		this.developerEmpId = developerEmpId;
		this.empDesignation = empDesignation;
	}


	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee name is::"+ developerName +" with Employee Id::"+developerEmpId);
	}

}
