package com.example.bdback.repos;

import com.example.bdback.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository  extends JpaRepository<Tasks, Integer> {
}
