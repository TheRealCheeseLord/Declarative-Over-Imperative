package at.spengergasse.doi.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record EmployeeDto(
        @NotNull
        String name,
        @NotNull
        @Min(18)
        Integer age,
        @NotNull
        double salary
) {}
