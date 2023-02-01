package buildingRestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(IEmployeeManager employeeManager){
        return args -> {

            log.info("Preloading " + employeeManager.newEmployee(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + employeeManager.newEmployee(new Employee("Frodo Baggins", "thief")));
        };
    }
}
