package com.example.demo.dto;

import com.example.demo.model.employees;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

public class employeesIn implements Serializable {
    @NotBlank
    @Length(min = 5, max = 30)
    private String fullName;

    @Min(0) @Max(120)
    private Integer age;

    @Min(0) @Max(100)
    private Integer seniority;

    @Min(0) @Max(100)
    private Double salary;

    public @NotBlank @Length(min = 5, max = 30) String getFullName() {
        return fullName;
    }

    public void setFullName(@NotBlank @Length(min = 5, max = 30) String fullName) {
        this.fullName = fullName;
    }

    public @Min(0) @Max(120) Integer getAge() {
        return age;
    }

    public void setAge(@Min(0) @Max(120) Integer age) {
        this.age = age;
    }

    public @Min(0) @Max(100) Integer getSeniority() {
        return seniority;
    }

    public void setSeniority(@Min(0) @Max(100) Integer seniority) {
        this.seniority = seniority;
    }

    public @Min(0) @Max(100) Double getSalary() {
        return salary;
    }

    public void setSalary(@Min(0) @Max(100) Double salary) {
        this.salary = salary;
    }

    public employees toEmployees(employeesIn employeesIn) {
        return new employees(
                employeesIn.getFullName(),
                employeesIn.getAge(),
                employeesIn.getSeniority(),
                employeesIn.getSalary()
        );
    }

    public void updateEmployees(employees employees) {
        employees.setFullName(fullName);
        employees.setAge(age);
        employees.setSeniority(seniority);
        employees.setSalary(salary);
    }
}