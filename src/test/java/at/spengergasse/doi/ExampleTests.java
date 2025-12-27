package at.spengergasse.doi;

import at.spengergasse.doi.domain.Employee;
import at.spengergasse.doi.service.EmployeeService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ExampleTests {

    @Autowired
    private EmployeeService employeeService;

    private final List<Employee> employees = List.of(
            Employee.builder().name("Employee1").age(35).salary(65_000).build(),
            Employee.builder().name("Employee1").age(38).salary(50_000).build(),
            Employee.builder().name("Employee1").age(42).salary(60_000).build(),
            Employee.builder().name("Employee1").age(22).salary(35_000).build(),
            Employee.builder().name("Employee1").age(27).salary(45_000).build(),
            Employee.builder().name("Employee1").age(29).salary(40_000).build()
    );

    @Test
    public void imperative_average_test() {
        var result = employeeService.imperativeAverageOfWealthySeniors(employees);

        assertThat(result).isEqualTo((65_000 + 60_000) / 2);
    }

    @Test
    public void declarative_average_test() {
        var result = employeeService.declarativeAverageOfWealthySeniors(employees);

        assertThat(result).isEqualTo((65_000 + 60_000) / 2);
    }
}
