package fr.evanperreau.API.service;

import fr.evanperreau.API.model.Employee;
import fr.evanperreau.API.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(final Employee employee) {
        return employeeRepository.save(employee);
    }
}
