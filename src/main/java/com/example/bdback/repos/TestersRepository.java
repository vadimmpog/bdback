package com.example.bdback.repos;

import com.example.bdback.models.Developers;
import com.example.bdback.models.Testers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestersRepository  extends JpaRepository<Testers, Integer> {
    List<Testers> findByPositionLike(String expr);
    List<Testers> findByTeamLike(String expr);
}
