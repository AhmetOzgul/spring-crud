package com.example.demo.dao;

import java.util.List;
import com.example.demo.model.Employee;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Long id);
}
