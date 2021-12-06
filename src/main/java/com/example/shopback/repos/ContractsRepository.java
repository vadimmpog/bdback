package com.example.shopback.repos;

import com.example.shopback.models.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractsRepository  extends JpaRepository<Contracts, Integer> {
}
