package com.fortuneprac.CrudOperation.repository;

import com.fortuneprac.CrudOperation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
