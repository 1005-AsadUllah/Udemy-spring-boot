package com.udemy.Controllers;

import com.udemy.entity.Employee;
import com.udemy.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/employees")
public class EmployControllers {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeServices.save(employee);
    }
}

