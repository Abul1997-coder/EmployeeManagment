package com.example.Employeedetails.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "employee_details")  // optional, defaults to "employee"
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "emp_address")
    private String address;

    @Column(name = "emp_salary")
    private double salary;

    public EmployeeEntity() {
        // Required by JPA / Hibernate
    }
}
