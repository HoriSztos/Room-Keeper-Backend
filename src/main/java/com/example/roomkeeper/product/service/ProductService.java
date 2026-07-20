package com.example.roomkeeper.product.service;

import com.example.roomkeeper.product.model.Product;
import com.example.roomkeeper.product.repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product add(Product p) {
        return productRepository.save(p);
    }
}
