package com.example.Employeedetails.CustomeException;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String id)
    {
        super("Employee not found with ID:"+ id);
    }
}
