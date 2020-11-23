package com.example.CompanyAnnotation.services;

import java.util.List;

import com.example.CompanyAnnotation.Entity.Department;
import com.example.CompanyAnnotation.Entity.Employee;

public interface CompanyServices {
	
	// da gi vraka site pod od Employee
	List<Employee> findAllEmployees(); 
	
	// da gi vraka site pod od Department
	List<Department> findAllDepartment(); 
	
	// Od Works on da se vadat
	Employee getEmployeeWorksAt(Department department); 	
	
	//da gi najdeme site proekti vo eden department
    List<Department> getAllProjectsAt(Department department); 
}
