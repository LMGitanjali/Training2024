package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.service.EmployeeService;

public class EmployeeInsuranceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		EmployeeService employeeService = new Service();

        employeeService.getEmployeeDetails(employee);

        employeeService.findInsuranceScheme(employee);

        employeeService.displayEmployeeDetails(employee);
	}

}
