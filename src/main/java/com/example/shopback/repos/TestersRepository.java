package com.example.shopback.repos;

import com.example.shopback.models.Testers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestersRepository  extends JpaRepository<Testers, Integer> {
}
