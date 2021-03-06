package com.kshitij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kshitij.model.Employee;
import com.kshitij.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	public void put(Employee req) {
		Employee emp=new Employee();
		emp.setEId(req.getEId());
		emp.setAge(req.getAge());
		emp.setName(req.getName());
		emp.setAddress(req.getAddress());
		
		employeeRepository.save(emp);
		
	}

	public List<Employee> findEmp() {
		List<Employee> emp=employeeRepository.findAll();
		return emp;
	}

	public Optional<Employee> findEmpById(Integer id) {
		Optional<Employee> emp=employeeRepository.findById(id);
		return emp;
		
	}
	
	
	

}
