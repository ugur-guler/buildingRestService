package buildingRestService;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmployeeManager {
    List<Employee> all();
    Employee newEmployee( Employee employee);
    Employee one(Long id);
    Employee replaceEmployee(Long id,Employee newEmployee);
    void deleteEmplooyee(Long id);
}
