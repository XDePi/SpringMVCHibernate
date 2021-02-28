package ru.depi.mvc.service;

import ru.depi.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmp(Employee employee);

    public Employee getEmp(int id);

    public void deleteEmp(int id);

}
