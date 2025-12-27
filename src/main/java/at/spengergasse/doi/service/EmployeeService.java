package at.spengergasse.doi.service;

import at.spengergasse.doi.domain.Employee;
import at.spengergasse.doi.dtos.EmployeeDto;
import at.spengergasse.doi.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor

@Service
@Transactional(readOnly = true)
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public List<EmployeeDto> findAll() {
        return employeeRepository.findAllProjectedBy();
    }

    public double imperativeAverageOfWealthySeniors(List<Employee> employees) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getAge() > 30 && employee.getSalary() > 50_000) {
                sum += employee.getSalary();
                count++;
            }
        }
        double averageSalary = count > 0 ? sum / count : 0;

        return averageSalary;
    }

    public double declarativeAverageOfWealthySeniors(List<Employee> employees) {
        double averageSalary = employees.stream()
                .filter(e -> e.getAge() > 30)
                .filter(e -> e.getSalary() > 50_000)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        return averageSalary;
    }
}
