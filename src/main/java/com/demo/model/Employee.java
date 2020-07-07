package com.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "SALARY")
    private double salary;
    @Column(name = "SOME_DATE")
    private LocalDate someDate;
    @Column(name = "SOME_TIME")
    private LocalTime someTime;
    @Column(name = "SOME_DATETIME")
    private LocalDateTime someDatetime;
    @Column(name = "ACTIVE")
    private boolean active;
}
