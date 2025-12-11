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
    //  POST /api/employee/all (Get all employees)
    //http://localhost:8081/api/employee/all
    @GetMapping("/all")
    public List<EmployeeEntity> getAllEmployee()
    {
        return service.getAllEmployees();
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<List<EmployeeEntity>> getEmployeeByid(@PathVariable Long id)
    {
        List<EmployeeEntity> employee = service.getByEmployoeeId(id);
        return ResponseEntity.ok(employee);
    }

  //Update Employee by id
    @PutMapping("/{id}")
  public EmployeeEntity updateEmployee(@PathVariable Long id,@RequestBody EmployeeEntity employeeEntity)
  {
      return service.updateEmployee(id,employeeEntity);
  }


//delete Employee by id
//http://localhost:8081/api/employee/8
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id)
    {
        service.deleteEmployee(id);
        return "Employee deleted by id"+ id;
    }

}
