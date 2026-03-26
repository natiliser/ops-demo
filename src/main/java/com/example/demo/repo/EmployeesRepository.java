package com.example.demo.repo;
import com.example.demo.model.employees;
import org.springframework.data.repository.CrudRepository;


public interface EmployeesRepository extends CrudRepository<employees,Long>{

}
