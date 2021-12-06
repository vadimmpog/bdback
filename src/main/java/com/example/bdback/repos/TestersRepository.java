package com.example.bdback.repos;

import com.example.bdback.models.Testers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestersRepository  extends JpaRepository<Testers, Integer> {
}
