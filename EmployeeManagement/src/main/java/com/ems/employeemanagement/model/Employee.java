package com.ems.employeemanagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "role",nullable = false)
    private String role;

    @Column(name = "salary",nullable = false)
    private int salary;
}
