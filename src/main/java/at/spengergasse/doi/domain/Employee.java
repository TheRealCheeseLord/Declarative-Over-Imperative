package at.spengergasse.doi.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "employee")
public class Employee {
    @EmbeddedId
    private EmployeeId id;
    @Column(nullable = false)
    private String name;
    private int age;
    private double salary;

    public boolean isSenior() {
        return age > 30;
    }

    public record EmployeeId(@NotNull @GeneratedValue Long id) {}
}
