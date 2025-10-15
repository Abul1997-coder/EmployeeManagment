package com.example.Employeedetails.Contoller;


import com.example.Employeedetails.Model.EmployeeEntity;
import com.example.Employeedetails.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Rest Controller
@RequestMapping("/api/employee")    // Base path for all employee APIs

public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // POST /api/employee/add (for single employee)
    @PostMapping("/add")
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employeeEntity)
    {
        EmployeeEntity save= service.createEmployee(employeeEntity);
        return ResponseEntity.ok(save);
    }

    // POST /api/employee/addAll (for multiple employees)
    @PostMapping("/addAll")
    public ResponseEntity<List<EmployeeEntity>>createAllEmployee(@RequestBody List<EmployeeEntity> employeeEntities)
    {
        List<EmployeeEntity> save = service.createAllEmployee(employeeEntities);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/all")
    public List<EmployeeEntity> getAllEmployee() {
        return service.getAllEmployees();
    }

}
