package com.example.bdback.repos;


import com.example.bdback.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeesRepository  extends JpaRepository<Employees, Integer> {
    List<Employees> findByMailLike(String expr);
    List<Employees> findByWorkplaceLike(String expr);
}
