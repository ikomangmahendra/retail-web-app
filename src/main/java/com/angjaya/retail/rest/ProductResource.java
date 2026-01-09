package com.angjaya.retail.rest;

import com.angjaya.retail.domain.Product;
import com.angjaya.retail.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductResource {

    private final ProductRepository productRepository;

    public ProductResource(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity<Iterable<Product>> getAllProducts() {
        var results = productRepository.findAll();
        return ResponseEntity.ok().body(results);
    }
}
