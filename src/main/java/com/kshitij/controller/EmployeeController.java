package com.kshitij.controller;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class EmployeeController {
	
	
	private final EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee()
	{
		List<Employee> employeeList = employeeService.findEmp();
		log.debug("Employee List: {}", employeeList);
		return employeeList;
	}
	
	@PostMapping("/employees")
	public String putEmployee(@RequestBody Employee emp)
	{
		employeeService.put(emp);
		return "Insertion successful";
	}
	@GetMapping("employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer id)
	{
		return employeeService.findEmpById(id);
	}
	
}
