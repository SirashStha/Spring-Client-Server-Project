package com.project.springserver.model.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Master Class auto implemented by other places
//DAO --> Data Access Object
@Service
public class EmployeeDao {

    // Creating object for EmployeeRepository using Dependency Injection
    @Autowired
    private EmployeeRepository repository;

    public void save(Employee employee){
        repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(employees::add);
        return employees;
    }

    public void delete(Employee employee) {
        repository.delete(employee);
    }
}
