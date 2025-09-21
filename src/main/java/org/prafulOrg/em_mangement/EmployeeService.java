package org.prafulOrg.em_mangement;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);  //employee creation
    List<Employee> readEmployee(); //get all employees
    boolean deleteEmployee(Long id); // delete employee and return true if deleted and false if not deleted
    String updateEmployee(Long id, Employee employee);
    Employee readEmployeeById(Long id); // get employee by given id;
}
