package com.example.roomkeeper.product;

import com.example.roomkeeper.product.model.Product;
import com.example.roomkeeper.product.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product add(@RequestBody Product p) {
        return productService.add(p);
    }
}
