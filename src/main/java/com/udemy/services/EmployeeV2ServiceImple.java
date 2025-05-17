package com.udemy.services;

import com.udemy.entity.EmployeeEntity;
import com.udemy.model.Employee;
import com.udemy.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeV2ServiceImple implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee) {

        if(employee.getId()==null || employee.getEmail().isEmpty())
        {
            employee.setId(UUID.randomUUID().toString());
        }


        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        for (EmployeeEntity employeeEntity : employeeEntities) {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeEntity, employee);
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
       EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
       Employee employee = new Employee();
       BeanUtils.copyProperties(employeeEntity, employee);
       return employee;
    }

    @Override
    public String deleteById(String id) {
        employeeRepository.deleteById(id);
        return "Delete Employee Successfully";
    }
}
