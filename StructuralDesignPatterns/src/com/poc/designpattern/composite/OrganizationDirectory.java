package com.poc.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

//Composite Class
public class OrganizationDirectory implements Employee{

	private List<Employee> employeeList = new ArrayList<>();
	
	
	@Override
	public void showEmployeeDetails() {
		for(Employee empList:employeeList)
        {
			empList.showEmployeeDetails();
        }
	}
	
	public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
       
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}
