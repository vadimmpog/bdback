package com.example.bdback.repos;

import com.example.bdback.models.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractsRepository  extends JpaRepository<Contracts, Integer> {
}
