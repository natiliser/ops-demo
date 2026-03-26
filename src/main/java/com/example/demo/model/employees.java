package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name="student2")
public class employees implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Length(min = 5, max = 30)
    private String fullName;

    @Min(0)
    @Max(120)
    private Integer age;

    @Min(0)
    @Max(100)
    private Integer seniority;

    @Min(0)
    @Max(1000000)
    private Double salary;


    public employees() {
    }

    public employees(Long id, String fullName, Integer age, Integer seniority, Double salary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.seniority = seniority;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public @Min(0) @Max(1000000) Double getSalary() {
        return salary;
    }

    public void setSalary(@Min(0) @Max(1000000) Double salary) {
        this.salary = salary;
    }
}