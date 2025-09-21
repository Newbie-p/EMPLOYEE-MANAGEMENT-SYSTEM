package org.prafulOrg.em_mangement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees = new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployee() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        return employees.removeIf(e -> e.getId().equals(id));
    }

}
