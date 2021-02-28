package ru.depi.mvc.dao;

import ru.depi.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmp(Employee employee);

    Employee getEmp(int id);

    void deleteEmp(int id);
}
