package com.cg.eis.main;

import com.cg.eis.exception.EmployeeException;
public class Main {
	 public static void main(String[] args) {
	        try {
	            validateSalary(3200);  
	        	} catch (EmployeeException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    private static void validateSalary(double salary) throws EmployeeException {
	        if (salary < 3000) {
	            throw new EmployeeException("Salary cannot be below 3000");
	        }
	        else {
	        	System.out.println("Salary: " + salary);
	        }
	    }
}
