package buildingRestService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController implements  IController{
    @Autowired
    private IEmployeeManager employeeManager;

    @GetMapping("/employees")
    @Override
    public List<Employee> all() {
        return employeeManager.all();
    }
    @PostMapping("employees")
    @Override
    public Employee newEmployee(@RequestBody Employee employee) {
        return employeeManager.newEmployee(employee);
    }
    @GetMapping("/employees/{id}")
    @Override
    public Employee one(@RequestBody @PathVariable Long id) {
        return employeeManager.one(id);
    }
    @PutMapping("/employees/{id}")
    @Override
    public Employee replaceEmployee(@PathVariable Long id,@RequestBody Employee newEmployee) {
        return employeeManager.replaceEmployee(id,newEmployee);
    }
    @DeleteMapping("/employees/{id}")
    @Override
    public void deleteEmplooyee(@PathVariable Long id) {
        employeeManager.deleteEmplooyee(id);

    }
}
