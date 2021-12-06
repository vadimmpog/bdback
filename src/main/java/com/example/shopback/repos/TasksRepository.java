package com.example.shopback.repos;

import com.example.shopback.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository  extends JpaRepository<Tasks, Integer> {
}
