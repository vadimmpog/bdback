package com.example.bdback.repos;

import com.example.bdback.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository  extends JpaRepository<Products, Integer> {
}
