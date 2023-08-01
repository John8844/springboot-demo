package com.ems.employeemanagement.service.impl;

import com.ems.employeemanagement.model.Employee;
import com.ems.employeemanagement.repository.EmployeeRepository;
import com.ems.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
