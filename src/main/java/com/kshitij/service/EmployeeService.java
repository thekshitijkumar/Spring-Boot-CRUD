package com.kshitij.service;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshitij.model.Employee;
import com.kshitij.repository.EmployeeRepository;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> findEmpById(Integer id) {
		return employeeRepository.findById(id);
		
	}
	
	
	

}
