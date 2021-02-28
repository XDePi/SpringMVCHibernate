package ru.depi.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.depi.mvc.entity.Employee;
import ru.depi.mvc.service.EmployeeService;

import java.util.List;

/**
 * Made by DePi
 **/
@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmps = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmps);
        return "allEmp";
    }

    @RequestMapping("/addNewEmp")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "empInfo";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute(name = "employee") Employee employee) {
        employeeService.saveEmp(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam(name = "empId") int id,
                                 Model model) {
        Employee employee = employeeService.getEmp(id);
        model.addAttribute("employee", employee);
        return "empInfo";
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmployee(@RequestParam(name = "empId") int id) {
        employeeService.deleteEmp(id);
        return "redirect:/";
    }
}
