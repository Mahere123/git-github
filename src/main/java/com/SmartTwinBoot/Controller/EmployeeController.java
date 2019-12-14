package com.SmartTwinBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SmartTwinBoot.Model.Employee;
import com.SmartTwinBoot.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/save")
	public void save(@RequestBody Employee employee) {
		employeeService.save(employee);
	}

}
