package com.example.roomkeeper.product.repository;

import com.example.roomkeeper.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
