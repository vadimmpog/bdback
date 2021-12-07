package com.example.bdback.repos;

import com.example.bdback.models.Private;
import com.example.bdback.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository  extends JpaRepository<Products, Integer> {
    List<Products> findByProductNameLike(String expr);
    List<Products> findByVersionLike(String expr);
}
