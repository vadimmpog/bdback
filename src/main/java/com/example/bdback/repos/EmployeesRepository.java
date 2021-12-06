package com.example.bdback.repos;

import com.example.bdback.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository  extends JpaRepository<Employees, Integer> {
}
