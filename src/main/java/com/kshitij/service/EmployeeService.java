package com.kshitij.service;

import org.springframework.stereotype.Service;

import com.kshitij.model.Employee;
import com.kshitij.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;

//	public Employee find(int eId) {
//		
//		
//		
//		
//		return null;
//	}

	public void put(Employee req) {
		Employee emp=new Employee();
		emp.setEId(req.getEId());
		emp.setAge(req.getAge());
		emp.setName(req.getName());
		emp.setAddress(req.getAddress());
		
		employeeRepository.save(emp);
		
	}
	
	
	

}
