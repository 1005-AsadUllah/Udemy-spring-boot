package com.udemy.services;

import com.udemy.model.Employee;

import java.util.List;

public interface EmployeeService {

     Employee save( Employee employee);


     List<Employee> getAllEmployees();

     Employee getEmployeeById(String id);

     String deleteById(String id);
}
