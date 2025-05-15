package com.udemy.services;

import com.udemy.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImple implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {

        if(employee.getId()==null || employee.getEmail().isEmpty())
        {
           employee.setId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public String deleteById(String id) {
        Employee employee = employees.stream().filter(e -> e.getId().equals(id)).findFirst().get();
        employees.remove(employee);
        return "Delete Employee Successfully";
    }
}


