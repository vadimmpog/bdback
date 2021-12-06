package com.example.bdback.repos;

import com.example.bdback.models.Private;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrivateRepository extends JpaRepository<Private, Integer> {
    @Query("SELECT p FROM Private p ORDER BY :column ASC ")
    List<Private> orderByASC(@Param("column") String column);

    @Query("SELECT p FROM Private p ORDER BY :column DESC ")
    List<Private> orderByDESC(@Param("column") String column);

    @Query("SELECT p FROM Private p WHERE :wh")
    List<Private> where(@Param("wh") String where);

    @Query("SELECT p FROM Private p WHERE :col LIKE :li")
    List<Private> like(@Param("li") String like, @Param("col") String column);
}
