package com.example.bdback.repos;

import com.example.bdback.models.Products;
import com.example.bdback.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository  extends JpaRepository<Tasks, Integer> {
    List<Tasks> findByDescriptionLike(String expr);
    List<Tasks> findByTeamLike(String expr);
}
