package com.demo.service;

import com.demo.model.Employee;
import com.demo.repository.demo1.EmployeeRepository1;
import com.demo.repository.demo2.EmployeeRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository1 employeeRepository1;

    @Autowired
    private EmployeeRepository2 employeeRepository2;

    public List<Employee> findAll() {
        List<Employee> employees1 = StreamSupport
                .stream(employeeRepository1.findAll().spliterator(), false)
                .collect(Collectors.toList());

        List<Employee> employees2 = StreamSupport
                .stream(employeeRepository2.findAll().spliterator(), false)
                .collect(Collectors.toList());

        return Stream.concat(employees1.stream(), employees2.stream()).collect(Collectors.toList());
    }
}
