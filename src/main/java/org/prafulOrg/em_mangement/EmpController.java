package org.prafulOrg.em_mangement;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class EmpController {
    
    // EmployeeService employeeService = new EmployeeServiceImpl();
    @Autowired
    EmployeeService employeeService; // DEPENDECY INJECTION

    @GetMapping("employees")
    public List<Employee> getAllEmployess() {
        return employeeService.readEmployee();
    }

    @PostMapping("employees")
    public String postMethodName(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
        
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id)){
            return "Delete Successfully";
        }
        return "not found";
    }
    
    
}
