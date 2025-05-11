package com.udemy.services;

import com.udemy.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImple implements EmployeeServices {

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
}


