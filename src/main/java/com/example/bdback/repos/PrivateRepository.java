package com.example.bdback.repos;

import com.example.bdback.models.Private;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PrivateRepository extends JpaRepository<Private, Integer> {
    List<Private> findByFirstnameLike(String expr);
    List<Private> findByLastnameLike(String expr);
    List<Private> findByPhonenumLike(String expr);
    List<Private> findByInsuranceLike(String expr);
    List<Private> findByAddressLike(String expr);
}
