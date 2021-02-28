package ru.depi.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.depi.mvc.dao.EmployeeDAO;
import ru.depi.mvc.entity.Employee;

import java.util.List;

/**
 * Made by DePi
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

//    @Autowired
//    private DetailDAO detailDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmp(Employee employee) {
        employeeDAO.saveEmp(employee);
    }

    @Override
    @Transactional
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }

//    @Override
//    @Transactional
//    public void saveDetails(Details details) {
//        detailDAO.saveDetails(details);
//    }

//    @Override
//    @Transactional
//    public void saveDetailsAndEmp(Details details, Employee employee) {
//        employeeDAO.saveDetailsAndEmp(details, employee);
//    }
}
