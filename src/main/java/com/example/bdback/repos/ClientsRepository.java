package com.example.bdback.repos;

import com.example.bdback.models.Clients;
import com.example.bdback.models.Private;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Integer> {
    List<Clients> findByCompanyLike(String expr);
    List<Clients> findByAddressLike(String expr);
}
