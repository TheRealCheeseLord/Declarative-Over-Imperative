package at.spengergasse.doi.repository;

import at.spengergasse.doi.domain.Employee;
import at.spengergasse.doi.dtos.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Employee.EmployeeId> {

    @Query("SELECT new at.spengergasse.doi.dtos.EmployeeDto(e.name, e.age, e.salary) FROM Employee e")
    List<EmployeeDto> findAllProjectedBy();
}
