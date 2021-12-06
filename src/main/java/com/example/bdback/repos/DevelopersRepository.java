package com.example.bdback.repos;

import com.example.bdback.models.Developers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopersRepository  extends JpaRepository<Developers, Integer> {
}
