package com.example.Employeedetails.Repository;

import com.example.Employeedetails.Model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //// Tells Spring this is a DAO component
public interface EmoloyeeRepository extends JpaRepository<EmployeeEntity, Long> {
// No need to implement anything, JpaRepository provides CRUD(Create, Read, Update, Delete)) methods

}
