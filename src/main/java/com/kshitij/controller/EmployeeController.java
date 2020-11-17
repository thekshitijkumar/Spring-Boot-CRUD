package com.kshitij.controller;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
//		System.out.println(eId);
		
		return  employeeService.findEmp();
		
		
	}
	
	@PostMapping("/employee")
	public String putEmployee(@RequestBody Employee emp)
	{
//		System.out.println(emp.getName());
		employeeService.put(emp);
		
		return "Insertion successful";
	}
	
}
