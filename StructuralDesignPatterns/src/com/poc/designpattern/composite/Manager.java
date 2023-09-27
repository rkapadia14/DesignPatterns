package com.poc.designpattern.composite;

//Leaf Class
public class Manager implements Employee{

	private String managerName;
	private String managerEmpId;
	private String empDesignation;
	
	
	public Manager(String managerName, String managerEmpId, String empDesignation) {
		super();
		this.managerName = managerName;
		this.managerEmpId = managerEmpId;
		this.empDesignation = empDesignation;
	}



	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee name is::"+ managerName +" with Employee Id::"+managerEmpId);
		
	}

}
