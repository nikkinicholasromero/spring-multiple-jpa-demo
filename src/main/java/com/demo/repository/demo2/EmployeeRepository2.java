package com.demo.repository.demo2;

import com.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository2 extends CrudRepository<Employee, Integer> {
}
