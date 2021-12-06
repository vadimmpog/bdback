package com.example.shopback.repos;

import com.example.shopback.models.Developers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopersRepository  extends JpaRepository<Developers, Integer> {
}
