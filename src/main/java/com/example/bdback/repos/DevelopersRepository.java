package com.example.bdback.repos;

import com.example.bdback.models.Contracts;
import com.example.bdback.models.Developers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevelopersRepository  extends JpaRepository<Developers, Integer> {
    List<Developers> findByPositionLike(String expr);
    List<Developers> findByTeamLike(String expr);
}
