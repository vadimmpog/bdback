package com.example.bdback.repos;

import com.example.bdback.models.Private;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivateRepository extends JpaRepository<Private, Integer> {
}
