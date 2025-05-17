package com.udemy.Controllers;

import com.udemy.model.Employee;
import com.udemy.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("v2/employees")
public class EmployeeV2Controllers {

    @Qualifier("employeeV2ServiceImple")
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public  String deleteEmployeeById(@PathVariable String id)
    {
        return employeeService.deleteById(id);
    }

}
