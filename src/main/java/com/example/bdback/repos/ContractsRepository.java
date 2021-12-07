package com.example.bdback.repos;

import com.example.bdback.models.Contracts;
import com.example.bdback.models.Private;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractsRepository  extends JpaRepository<Contracts, Integer> {
    List<Contracts> findByPaymentStateLike(String expr);
}
