package com.kshitij.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.model.Employee;
import com.kshitij.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {
	
	
	private final EmployeeService employeeService;
	
//	@GetMapping("/employee/{eid}")
//	public Employee getEmployee(@PathVariable int eId)
//	{
//		return employeeService.find(eId);
//		
//		
//	}
	
	@PostMapping("/employee")
	public String putEmployee(@RequestBody Employee emp)
	{
		System.out.println(emp.getName());
		employeeService.put(emp);
		
		return "Insertion successful";
	}
	
}
