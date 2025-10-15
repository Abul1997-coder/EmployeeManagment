package com.example.Employeedetails.Service;


import com.example.Employeedetails.Model.EmployeeEntity;
import com.example.Employeedetails.Repository.EmoloyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Business logic layer
public class EmployeeService {

    @Autowired
    EmoloyeeRepository repository;

    // Create employee logic
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity)
    {
        return repository.save(employeeEntity);

    }

    // Get all employees
    public List<EmployeeEntity> getAllEmployees()
    {
        return repository.findAll ();

    }


}


/*
The Controller handles HTTP requests and responses (web layer).
The Service contains business logic — rules, validations, and operations related to the application's core domain.
The Repository handles direct database interactions.


How Your EmployeeService Works:******

It receives requests from the controller.
It fetches or updates employee data by calling the repository.
It handles exceptions like EmployeeNotFoundException when an employee is not found.
It encapsulates all logic related to employees — create, read, update, delete.

Use Case: Updating an Employee’s Department and Salary:****

The HR manager wants to update an employee’s department and salary.
The controller gets the HTTP PUT request and calls:
First checks if the employee exists (repository.findById(id)).
If not found, it throws an EmployeeNotFoundException, which could trigger a 404 HTTP response.
If found, it updates the employee’s fields.
Saves the changes via the repository (repository.save(existing)).

* */