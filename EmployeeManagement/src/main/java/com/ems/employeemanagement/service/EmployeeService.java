package com.ems.employeemanagement.service;

import com.ems.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeBtId(int id);
    Employee updateEmployee(Employee employee,int id);
    void deletaEmployee(int id);
}
