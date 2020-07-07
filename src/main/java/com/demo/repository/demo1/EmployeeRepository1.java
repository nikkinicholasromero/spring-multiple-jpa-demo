package com.demo.repository.demo1;

import com.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository1 extends CrudRepository<Employee, Integer> {
}
