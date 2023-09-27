package com.poc.designpattern.composite;

public class CompanyClient {

	public static void main(String[] args) {
		Developer dev1 = new Developer("D100", "John", "Pro Developer");
        Developer dev2 = new Developer("D101", "Mathews", "Developer");
        OrganizationDirectory developerDirectory = new OrganizationDirectory();
        developerDirectory.addEmployee(dev1);
        developerDirectory.addEmployee(dev2);
          
        Manager manager1 = new Manager("M2000", "Rinali Kapadia", "SEO Manager");
        Manager manager2 = new Manager("M2001", "Siddharth Shah", "Digital Marketing Manager");
          
        OrganizationDirectory managerDirectory = new OrganizationDirectory();
        managerDirectory.addEmployee(manager1);
        managerDirectory.addEmployee(manager2);
      
        //Creating of Tree-like structure
        OrganizationDirectory directory = new OrganizationDirectory();
        directory.addEmployee(developerDirectory);
        directory.addEmployee(managerDirectory);
        directory.showEmployeeDetails();
       
        System.out.println("After deleting developers, Employee list is::");
        directory.removeEmployee(developerDirectory);
        directory.showEmployeeDetails();
	}

}
