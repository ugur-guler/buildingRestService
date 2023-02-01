package buildingRestService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class EmployeeManager implements IEmployeeManager {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> all() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee newEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee one(Long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public Employee replaceEmployee(Long id, Employee newEmployee) {
        Employee employee = employeeRepository.getById(id);
        employee.setName(newEmployee.getName());
        employee.setRole(newEmployee.getRole());
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmplooyee(Long id) {
        employeeRepository.deleteById(id);

    }
}
